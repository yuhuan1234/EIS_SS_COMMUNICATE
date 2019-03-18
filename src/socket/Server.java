package socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) { 
		
		ServerSocket serverSocket = null;
	    
		try { 
	      serverSocket = new ServerSocket(22239);
	      Socket socket = null; //����һ����������Socket,��ָ���˿ڣ��������˶˿� 
	     
	      int count = 0; //��¼�ͻ��˵����� 
	      
	      System.out.println("***�������������ȴ��ͻ��˵�����***"); 
	      
	      //while (true)//ѭ������
	      //{ 
	        socket = serverSocket.accept(); 
	        //����accept()������ʼ�������ȴ��ͻ��˵����� 
	        System.out.println("======================================================================");
	        ServerThread serverThread = new ServerThread(socket); //�����߳� 
	        serverThread.start(); //�����߳� 
	  
	        count++; //ͳ�ƿͻ��˵����� 
	        System.out.println("�ͻ��˵�����: " + count); 
	        InetAddress address = socket.getInetAddress(); 
	        System.out.println("��ǰ�ͻ��˵�IP �� " + address.getHostAddress()); 
	      //} 
	    } catch (IOException e) { 
	      e.printStackTrace(); 
	    } finally{
	    	try{
	    		if(serverSocket!=null){
	    			serverSocket.close();
	    		}
	    	}
	    	catch(Exception e){
	    		e.printStackTrace();
	    	}
	    }
	  } 
}
