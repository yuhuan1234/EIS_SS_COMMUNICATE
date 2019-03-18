package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class BtnListener2 implements ActionListener {

    private String IPadress;
	
	BtnListener2(String IPadress)
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
	      //�����ͻ���Socket��ָ���������˿ںź͵�ַ 
	      
	      os = socket.getOutputStream(); 
	      byte[] bt = new byte[1024];
	      bt[0] = 2;
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
          os.write(bt);  
          
	      socket.shutdownOutput(); //�ر������ 
	  
	      if(os!=null)
	          os.close();
	      if(socket!=null)
	          socket.close(); 
	    } catch (IOException e1) { 
	      e1.printStackTrace(); 
	    } 
		
	}

}
