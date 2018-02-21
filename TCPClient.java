import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient implements Runnable 
{
	private Socket socket1 = null;
	private Socket socket2 = null;
	private Socket socket3 = null;
	private Socket socket4 = null;
	private Socket socket5 = null;
	private DataInputStream inStream = null;
	private DataOutputStream outStream = null;
	private FileOutputStream out = null;
	
	
	private void makeSocket1()
	{
		try
		{
			socket1 = new Socket("localhost", 3339);
			inStream = new DataInputStream(socket1.getInputStream());
			outStream = new DataOutputStream(socket1.getOutputStream());
		} 
		catch (UnknownHostException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		receiveFile1();
	}
	
	public void receiveFile1()
	{
		try 
		{
			int fileSize = inStream.readInt();
			byte[] data = new byte[fileSize];
			out = new FileOutputStream("newfile1.zip");
			int count =0, totalBytes=0;
			while(true)
			{
				count = inStream.read(data, 0, fileSize);
				byte[] arrayBytes = new byte[count];
				System.arraycopy(data, 0, arrayBytes, 0, count);
				totalBytes = totalBytes + count;
				if(count>0)
				{
					out.write(arrayBytes);
					out.flush();
				}
				if(totalBytes == fileSize)
					break;
			}
			System.out.println("Total bytes downloaded " + totalBytes + " bytes.");
			inStream.close();
			socket1.close();
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void makeSocket2()
	{
		try
		{
			socket2 = new Socket("localhost", 3340);
			inStream = new DataInputStream(socket2.getInputStream());
			outStream = new DataOutputStream(socket2.getOutputStream());
		} 
		catch (UnknownHostException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		receiveFile2();
	}
	
	public void receiveFile2()
	{
		try 
		{
			int fileSize = inStream.readInt();
			byte[] data = new byte[fileSize];
			out = new FileOutputStream("newfile2.zip");
			int count =0, totalBytes=0;
			while(true)
			{
				count = inStream.read(data, 0, fileSize);
				byte[] arrayBytes = new byte[count];
				System.arraycopy(data, 0, arrayBytes, 0, count);
				totalBytes = totalBytes + count;
				if(count>0)
				{
					out.write(arrayBytes);
					out.flush();
				}
				if(totalBytes == fileSize)
					break;
			}
			System.out.println("Total bytes downloaded " + totalBytes + " bytes.");
			inStream.close();
			socket2.close();
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private void makeSocket3()
	{
		try
		{
			socket3 = new Socket("localhost", 3341);
			inStream = new DataInputStream(socket3.getInputStream());
			outStream = new DataOutputStream(socket3.getOutputStream());
		} 
		catch (UnknownHostException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		receiveFile1();
	}
	
	public void receiveFile3()
	{
		try 
		{
			int fileSize = inStream.readInt();
			byte[] data = new byte[fileSize];
			out = new FileOutputStream("newfile3.zip");
			int count =0, totalBytes=0;
			while(true)
			{
				count = inStream.read(data, 0, fileSize);
				byte[] arrayBytes = new byte[count];
				System.arraycopy(data, 0, arrayBytes, 0, count);
				totalBytes = totalBytes + count;
				if(count>0)
				{
					out.write(arrayBytes);
					out.flush();
				}
				if(totalBytes == fileSize)
					break;
			}
			System.out.println("Total bytes downloaded " + totalBytes + " bytes.");
			inStream.close();
			socket3.close();
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private void makeSocket4()
	{
		try
		{
			socket4 = new Socket("localhost", 3342);
			inStream = new DataInputStream(socket4.getInputStream());
			outStream = new DataOutputStream(socket4.getOutputStream());
		} 
		catch (UnknownHostException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		receiveFile1();
	}
	
	public void receiveFile4()
	{
		try 
		{
			int fileSize = inStream.readInt();
			byte[] data = new byte[fileSize];
			out = new FileOutputStream("newfile4.zip");
			int count =0, totalBytes=0;
			while(true)
			{
				count = inStream.read(data, 0, fileSize);
				byte[] arrayBytes = new byte[count];
				System.arraycopy(data, 0, arrayBytes, 0, count);
				totalBytes = totalBytes + count;
				if(count>0)
				{
					out.write(arrayBytes);
					out.flush();
				}
				if(totalBytes == fileSize)
					break;
			}
			System.out.println("Total bytes downloaded " + totalBytes + " bytes.");
			inStream.close();
			socket4.close();
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	private void makeSocket5()
	{
		try
		{
			socket5 = new Socket("localhost", 3343);
			inStream = new DataInputStream(socket5.getInputStream());
			outStream = new DataOutputStream(socket5.getOutputStream());
		} 
		catch (UnknownHostException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		receiveFile1();
	}
	
	public void receiveFile5()
	{
		try 
		{
			int fileSize = inStream.readInt();
			byte[] data = new byte[fileSize];
			out = new FileOutputStream("newfile5.zip");
			int count =0, totalBytes=0;
			while(true)
			{
				count = inStream.read(data, 0, fileSize);
				byte[] arrayBytes = new byte[count];
				System.arraycopy(data, 0, arrayBytes, 0, count);
				totalBytes = totalBytes + count;
				if(count>0)
				{
					out.write(arrayBytes);
					out.flush();
				}
				if(totalBytes == fileSize)
					break;
			}
			System.out.println("Total bytes downloaded " + totalBytes + " bytes.");
			inStream.close();
			socket5.close();
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void main(String args[])
	{
		long startTime = System.currentTimeMillis();
		TCPClient client1 = new TCPClient();
		TCPClient client2 = new TCPClient();
		TCPClient client3 = new TCPClient();
		TCPClient client4 = new TCPClient();
		TCPClient client5 = new TCPClient();
		
		Thread t1 = new Thread(new TCPClient())
				{
					public void run()
					{
						client1.makeSocket1();
						client1.receiveFile1();
					}
				};
		Thread t2 = new Thread(new TCPClient())
				{
					public void run()
					{
						client2.makeSocket2();
						client2.receiveFile2();
					}
				};
		Thread t3 = new Thread(new TCPClient())
				{
					public void run()
					{
						client3.makeSocket3();
						client3.receiveFile3();
					}
				};
		Thread t4 = new Thread(new TCPClient())
				{
					public void run()
					{
						client4.makeSocket4();
						client4.receiveFile4();
					}
				};
				Thread t5 = new Thread(new TCPClient())
				{
					public void run()
					{
						client5.makeSocket5();
						client5.receiveFile5();
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
		//creates merger object to merge the downloaded files.
		Merger merger = new Merger();
		merger.merge();
		long stopTime = System.currentTimeMillis();
		System.out.println("The time taken to download the file is " + (stopTime- startTime) + " miliseconds, " + ((stopTime- startTime)/1000) + " seconds.");
		
	}

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		
	}
}
