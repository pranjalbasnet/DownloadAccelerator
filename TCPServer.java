import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.lang.*;

public class TCPServer implements Runnable
{
	private ServerSocket serverSocket1 = null;
	private Socket socket1 = null;
	private ServerSocket serverSocket2 = null;
	private Socket socket2 = null;
	private ServerSocket serverSocket3 = null;
	private Socket socket3 = null;
	private ServerSocket serverSocket4 = null;
	private Socket socket4 = null;
	private ServerSocket serverSocket5 = null;
	private Socket socket5 = null;
	private DataInputStream inStream = null;
	private DataOutputStream outStream = null;
	
	public void makeSocket1()
	{
		try 
		{
			serverSocket1 = new ServerSocket(3339);
			socket1 = serverSocket1.accept();
			inStream = new DataInputStream(socket1.getInputStream());
			outStream = new DataOutputStream(socket1.getOutputStream());
			System.out.println("Socket 1 is connected.\n");
//			sendFile1();
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sendFile1()
	{
		try 
		{
			File file = new File("file1.zip");
			int fileSize = (int) file.length();
			System.out.println("File size of " + file.getName() + " is " + fileSize + " bytes.\n");
			FileInputStream inFile = new FileInputStream(file);
			outStream.writeInt(fileSize);
			outStream.flush();
			byte [] data = new byte[fileSize];
			inFile.read(data, 0, fileSize);
			outStream.write(data);
			outStream.flush();
			inFile.close();
			socket1.close();
			serverSocket1.close();
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

	public void makeSocket2()
	{
		try 
		{
			serverSocket2 = new ServerSocket(3340);
			socket2 = serverSocket2.accept();
			inStream = new DataInputStream(socket2.getInputStream());
			outStream = new DataOutputStream(socket2.getOutputStream());
			System.out.println("Socket 2 is connected.\n");
//			sendFile2();
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sendFile2()
	{
		try 
		{
			File file = new File("file2.zip");
			int fileSize = (int) file.length();
			System.out.println("File size of " + file.getName() + " is " + fileSize + " bytes.\n");
			FileInputStream inFile = new FileInputStream(file);
			byte [] data = new byte[fileSize];
			inFile.read(data, 0, fileSize);
			outStream.writeInt(fileSize);
			outStream.flush();
			
			outStream.write(data);
			outStream.flush();
			inFile.close();
			socket2.close();
			serverSocket2.close();
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

	public void makeSocket3()
	{
		try 
		{
			serverSocket3 = new ServerSocket(3341);
			socket3 = serverSocket3.accept();
			inStream = new DataInputStream(socket3.getInputStream());
			outStream = new DataOutputStream(socket3.getOutputStream());
			System.out.println("Socket 3 is connected.\n");
//			sendFile2();
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sendFile3()
	{
		try 
		{
			File file = new File("file3.zip");
			int fileSize = (int) file.length();
			System.out.println("File size of " + file.getName() + " is " + fileSize + " bytes.\n");
			FileInputStream inFile = new FileInputStream(file);
			byte [] data = new byte[fileSize];
			inFile.read(data, 0, fileSize);
			outStream.writeInt(fileSize);
			outStream.flush();
			outStream.write(data);
			outStream.flush();
			inFile.close();
			socket3.close();
			serverSocket3.close();
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

	public void makeSocket4()
	{
		try 
		{
			serverSocket4 = new ServerSocket(3342);
			socket4 = serverSocket4.accept();
			inStream = new DataInputStream(socket4.getInputStream());
			outStream = new DataOutputStream(socket4.getOutputStream());
			System.out.println("Socket 4 is connected.\n");
//			sendFile2();
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sendFile4()
	{
		try 
		{
			File file = new File("file4.zip");
			int fileSize = (int) file.length();
			System.out.println("File size of " + file.getName() + " is " + fileSize + " bytes.\n");
			FileInputStream inFile = new FileInputStream(file);
			byte [] data = new byte[fileSize];
			inFile.read(data, 0, fileSize);
			outStream.writeInt(fileSize);
			outStream.flush();
			outStream.write(data);
			outStream.flush();
			inFile.close();
			socket4.close();
			serverSocket4.close();
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
	public void makeSocket5()
	{
		try 
		{
			serverSocket5 = new ServerSocket(3343);
			socket5 = serverSocket5.accept();
			inStream = new DataInputStream(socket5.getInputStream());
			outStream = new DataOutputStream(socket5.getOutputStream());
			System.out.println("Socket 5 is connected.\n");
//			sendFile2();
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sendFile5()
	{
		try 
		{
			File file = new File("file5.zip");
			int fileSize = (int) file.length();
			System.out.println("File size of " + file.getName() + " is " + fileSize + " bytes.\n");
			FileInputStream inFile = new FileInputStream(file);
			byte [] data = new byte[fileSize];
			inFile.read(data, 0, fileSize);
			outStream.writeInt(fileSize);
			outStream.flush();
			outStream.write(data);
			outStream.flush();
			inFile.close();
			socket5.close();
			serverSocket5.close();
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

	

	
	public static void main(String args[])
	{
		FileSplitter split = new FileSplitter("100MB.zip", 5);
		split.makePartition();
		TCPServer serve1 = new TCPServer();
		TCPServer serve2 = new TCPServer();
		TCPServer serve3 = new TCPServer();
		TCPServer serve4 = new TCPServer();
		TCPServer serve5 = new TCPServer();
		
		Thread t1 = new Thread(new TCPServer())
		{
			public void run()
			{
				serve1.makeSocket1();
				serve1.sendFile1();
			}
		};
		
		Thread t2 = new Thread(new TCPServer())
		{
			public void run()
			{
				serve2.makeSocket2();
				serve2.sendFile2();
			}
		};
		
		Thread t3 = new Thread(new TCPServer())
		{
			public void run()
			{
				serve3.makeSocket3();
				serve3.sendFile3();
			}
		};
		
		Thread t4 = new Thread(new TCPServer())
		{
			public void run()
			{
				serve4.makeSocket4();
				serve4.sendFile4();
			}
		};
		
		Thread t5 = new Thread(new TCPServer())
		{
			public void run()
			{
				serve5.makeSocket5();
				serve5.sendFile5();
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		try
		{
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void run()
	{
		
	}
}
