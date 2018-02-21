import java.io.*;
import java.util.ArrayList;
public class Merger  //Merger class implements the Runnable interface
{
	
	
		ArrayList<String> list = null;
		FileInputStream in1 = null;
		FileInputStream in2 = null;
		FileInputStream in3 = null;
		FileInputStream in4 = null;
		FileInputStream in5 = null;
		FileOutputStream out = null;
		

		public void merge()
		{
			//use FileInputStream & FileOutputStream to read partitions and write the merged file
			//use buffer of byte[] of 1000. keep track of how many bytes you read, so that you can stop after you have read
			//desired number of bytes
			try 
			{
				File file1 = new File("newfile1.zip");
				File file2 = new File("newfile2.zip");
				File file3 = new File("newfile3.zip");
				File file4 = new File("newfile4.zip");
				File file5 = new File("newfile5.zip");
				list = new ArrayList<String>();
				in1 = new FileInputStream(file1);
				in2 = new FileInputStream(file2);
				in3 = new FileInputStream(file3);
				in4 = new FileInputStream(file4);
				in5 = new FileInputStream(file5);
				out = new FileOutputStream("new100MB.zip");
//				String s1,s2,s3,s4,s5 =null;
				 
				//mrging first file
				int filesize = (int)file1.length();
				byte[] data = new byte[filesize];
				in1.read(data,0, filesize);
				out.write(data);
				
				int filesize2 = (int)file1.length();
				byte[] data2 = new byte[filesize2];
				in2.read(data2,0, filesize);
				out.write(data2);
				System.out.println();
				
				int filesize3 = (int)file3.length();
				byte[] data3 = new byte[filesize3];
				in3.read(data3,0, filesize3);
				out.write(data3);
				
				int filesize4 = (int)file4.length();
				byte[] data4 = new byte[filesize4];
				in4.read(data4,0, filesize4);
				out.write(data4);
				
				int filesize5 = (int)file5.length();
				byte[] data5 = new byte[filesize5];
				in5.read(data5,0, filesize5);
				out.write(data5);
				out.close();
				System.out.println("Merging Done.");
//				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

}