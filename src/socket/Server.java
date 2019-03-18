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
	      Socket socket = null; //创建一个服务器端Socket,绑定指定端口，并监听此端口 
	     
	      int count = 0; //记录客户端的数量 
	      
	      System.out.println("***服务器启动，等待客户端的连接***"); 
	      
	      //while (true)//循环监听
	      //{ 
	        socket = serverSocket.accept(); 
	        //调用accept()方法开始监听，等待客户端的连接 
	        System.out.println("======================================================================");
	        ServerThread serverThread = new ServerThread(socket); //创建线程 
	        serverThread.start(); //启动线程 
	  
	        count++; //统计客户端的数量 
	        System.out.println("客户端的数量: " + count); 
	        InetAddress address = socket.getInetAddress(); 
	        System.out.println("当前客户端的IP ： " + address.getHostAddress()); 
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
