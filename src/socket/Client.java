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

public class Client {
	
	public static void main(String[] args) { 
		
		Socket socket=null;
        OutputStream os=null;       
         
	    try { 
	      socket = new Socket("127.0.0.1",22239); 
	      //�����ͻ���Socket��ָ���������˿ںź͵�ַ 
	      
	      os = socket.getOutputStream(); 
	      byte[] bt = new byte[1024];
	      bt[0] = 1;
	      bt[1] = 4;
	      bt[2] = 0;
	      bt[3] = 7;
	      bt[4] = 1;
	      bt[5] = 0;
	      
	      bt[6] = 71;
	      bt[7] = 1;
	      bt[8] = 0;
	      bt[9] = (byte) 227;
	      bt[10] = 7;
	      bt[11] = 2;
	      bt[12] = 28;
	      bt[13] = (byte) 117;
	      bt[14] = 69;
	      bt[15] = 1;
	      bt[16] = 1;
          os.write(bt);  
          
	      socket.shutdownOutput(); //�ر������ 
	  
	      if(os!=null)
	          os.close();
	      if(socket!=null)
	          socket.close(); 
	    } catch (IOException e) { 
	      e.printStackTrace(); 
	    } 
	  } 


}
