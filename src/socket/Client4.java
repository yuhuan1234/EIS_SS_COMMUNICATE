package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

import MessageType.Message4;

public class Client4 {
	
	public static void main(String[] args) { 
		
		Socket socket=null;
        OutputStream os=null;       
         
	    try { 
	      socket = new Socket("127.0.0.1",22235); 
	      //创建客户端Socket，指定服务器端口号和地址 
	      
	      os = socket.getOutputStream(); 
	      byte[] bt = new byte[1024];
	      bt[0] = 4;
	      bt[1] = (byte) 260;
	      bt[2] = 0;
	      bt[3] = 71;
	      bt[4] = 1;
	      bt[5] = 0;
	      bt[6] = 7;
	      bt[7] = 1;
	      bt[8] = 0;
	      bt[9] = (byte) 227;
	      bt[10] = 7;
	      bt[11] = 3;
	      bt[12] = 1;
	      bt[15] = (byte) 220;
	      bt[16] = 0;
          os.write(bt);  
          
	      socket.shutdownOutput(); //关闭输出流 
	  
	      if(os!=null)
	          os.close();
	      if(socket!=null)
	          socket.close(); 
	    } catch (IOException e) { 
	      e.printStackTrace(); 
	    } 
	  } 


}
