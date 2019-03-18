package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class BtnListener1 implements ActionListener {

	private String IPadress;
	
	BtnListener1(String IPadress)
	{
		this.IPadress = IPadress;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		Socket socket=null;
        OutputStream os=null;       
         
	    try { 
	      socket = new Socket(IPadress,22237); 
	      //创建客户端Socket，指定服务器端口号和地址 
	      
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
          
	      socket.shutdownOutput(); //关闭输出流 
	  
	      if(os!=null)
	          os.close();
	      if(socket!=null)
	          socket.close(); 
	    } catch (IOException e1) { 
	      e1.printStackTrace(); 
	    } 
		
	}

}
