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

public class client3 {
	
	public static void main(String[] args) { 
		
		Socket socket=null;
        OutputStream os=null;       
         
	    try { 
	      socket = new Socket("127.0.0.1",22238); 
	      //创建客户端Socket，指定服务器端口号和地址 
	      
	      os = socket.getOutputStream(); 
	      byte[] bt = new byte[1024];
	      bt[0] = 3;
	      bt[1] = 23;
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
	      bt[13] = (byte) 116;
	      bt[14] = 70;
	      bt[15] = 1;
	      bt[16] = 0;
	      bt[17] = 0;
	      bt[18] = 0;
	      bt[19] = 0;
	      bt[20] = 0;
	      bt[21] = 0;
	      bt[22] = 0;
	      bt[23] = 0;
	      bt[24] = 4;
	      bt[25] = 0;
	      bt[26] = (byte) 169;
	      bt[27] = 97;
	      bt[28] = 3;
	      bt[29] = 1;
	      bt[30] = 0;
	      bt[31] = 0;
	      bt[32] = 0;
	      bt[33] = 0;
	      bt[34] = 0;
	      bt[35] = 0;
	      bt[36] = 0;
	      bt[37] = 0;
	      bt[38] = 0;
	      bt[39] = 0;
	      bt[40] = 0;
	      bt[41] = 23;
	      bt[42] = 0;
	      bt[43] = 7;
	      bt[44] = 1;
	      bt[45] = 0;
	      bt[46] = 71;
	      bt[47] = 1;
	      bt[48] = 0;
	      bt[49] = (byte) 227;
	      bt[50] = 7;
	      bt[51] = 2;
	      bt[52] = 28;
	      bt[53] = (byte) 116;
	      bt[54] = 70;
	      bt[55] = 1;
	      bt[56] = 0;
	      bt[57] = 0;
	      bt[58] = 0;
	      bt[59] = 0;
	      bt[60] = 0;
	      bt[61] = 0;
	      bt[62] = 0;
	      bt[63] = 0;
	      bt[64] = 4;
	      bt[65] = 0;
	      bt[66] = (byte) 169;
	      bt[67] = 97;
	      bt[68] = 3;
	      bt[69] = 1;
	      bt[70] = 0;
	      bt[71] = 0;
	      bt[72] = 0;
	      bt[73] = 0;
	      bt[74] = 0;
	      bt[75] = 0;
	      bt[76] = 0;
	      bt[77] = 0;
	      bt[78] = 0;
	      bt[79] = 0;
	      bt[80] = 0;
	      bt[81] = 1;
	      bt[82] = 0;
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
