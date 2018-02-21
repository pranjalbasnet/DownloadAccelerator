import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileSplitter extends Thread
{
	private File file;
	private int parts;
	FileInputStream reader;
	FileOutputStream writer;
	private byte[] data;
	protected static int minSize;
	private int extraBytes;
	private boolean isLastPartition = false;
	
	public FileSplitter(String fileName, int p)//two argument constructor for the class
	{
		try
		{
			parts = p;
			file = new File(fileName);
			minSize = (int) (file.length()/parts);
			extraBytes = (int) (file.length()%parts);
			reader = new FileInputStream(file);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void makePartition()
	{
//		System.out.println("debug check");
		int fileCounter = 1;
//		System.out.println("debug check2");
		for(int i=0; i<parts ; i++)
		{ 
//			System.out.println("debug check3");
			if (i == parts-1) //checks if we are making the last partition
			{
				isLastPartition = true;
			}
			data = readFile();
			writeFile(data,"file" + fileCounter + ".zip");
			try 
			{
				Thread.sleep(100);
//				System.out.println("Thread" + fileCounter + "done sleeping");
//				System.out.println("\n");
			} catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fileCounter++;
		}
		System.out.println(parts + " partitions are made successfully!!\n");
	}
	
	public byte[] readFile() 
	{
		byte[] data2;
		if (isLastPartition)
		{
			data2 = new byte[minSize + extraBytes];
		}
		else
		{
			data2 =  new byte[minSize];
		}
		try
		{
			reader.read(data2, 0, data2.length);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data2;	
	}
	public void writeFile(byte[] d, String newFile)//what happens if we make it File fileName
	{
		try
		{
			writer = new FileOutputStream(new File(newFile));
			writer.write(d);
			writer.close();
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
