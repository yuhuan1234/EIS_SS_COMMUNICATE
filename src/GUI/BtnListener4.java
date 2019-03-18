package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class BtnListener4 implements ActionListener {

    private String IPadress;
	
	BtnListener4(String IPadress)
	{
		this.IPadress = IPadress;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		Socket socket=null;
        OutputStream os=null;       
         
	    try { 
	      socket = new Socket(IPadress,22235); 
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
	    } catch (IOException e1) { 
	      e1.printStackTrace(); 
	    } 
		
	}

}
