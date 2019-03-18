package socket;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import JDBC.JDBC;
import MessageType.Message;
import MessageType.Message1;
import MessageType.Message2;
import MessageType.Message3;
import MessageType.Message4;

public class ServerThread extends Thread{

	  private Socket socket = null; 
	  JDBC con = new JDBC();
	  Connection connection = con.getCon();
	  PreparedStatement pstmt;
	  
	  public ServerThread()
	  {      
	  }//无参构造
	  public ServerThread(Socket socket)
	  { 
	    this.socket = socket; 
	  } //带参构造
	  
	  public void run(){ 
	  
	    InputStream is = null;
	    OutputStream os=null;  
	   
	    try { 
	      is = socket.getInputStream(); 
	      socket.setSoTimeout(50000);
	      //while(true)
	      //{	  
	      byte[] bt = new byte[1024];
	      List<Integer> list = new ArrayList<Integer>();
	      is.read(bt);
	      
	      //接收客户端信息
	      for(int i=0;i < bt.length;i++)
	      {
	    	int intTmp = bt[i];
	    	while(intTmp < 0)
	    	{
	    		intTmp = intTmp + 256;
	    		
	    	}
//	    	System.out.print(intTmp + ",");
	        list.add(intTmp);//将数据添加到集合中进行分析
	      }
	      //}
	      
	      //对信息进行处理
	      switch(list.get(0))//判定信息类型
	      {
	      case 1:
	    	  System.out.println("");
	    	  int i1 = 1;
	    	  Message1 mes1 = new Message1(i1++,list.get(0).toString(),list.get(3).toString(),
	    			  list.get(6).toString(),list.get(8).toString(),list.get(9).toString(),
	    			  list.get(15).toString(),list.get(16).toString());
	    	  System.out.println(mes1.toString());
              
	    	  int s1 = Insert_Msg1(mes1);
	    	  if(s1 > 0)
	    	  {
	    		  System.out.println("插入成功");
	    	  }
	    	  else
	    	  {
	    		  System.out.println("插入失败");
	    	  }
	    	  
	    	  break;
	      case 2:
	    	  System.out.println("");
	    	  int i2 = 1;
	    	  Message2 mes2 = new Message2(i2++,list.get(0).toString(),list.get(3).toString(),
	    			  list.get(6).toString(),list.get(8).toString(),list.get(9).toString(),
	    			  list.get(16).toString(),list.get(20).toString(),list.get(24).toString(),
	    			  list.get(26).toString(),list.get(28).toString(),list.get(29).toString(),
	    			  list.get(30).toString());
	    	  System.out.println(mes2.toString());
	    	  
	    	  int s2 = Insert_Msg2(mes2);
	    	  if(s2 > 0)
	    	  {
	    		  System.out.println("插入成功");
	    	  }
	    	  else
	    	  {
	    		  System.out.println("插入失败");
	    	  }
	    	  
	    	  break;
	      case 3:
	    	  System.out.println("");
	    	  int i3 = 1;
	    	  Message3 mes3 = new Message3(i3++,list.get(0).toString(),list.get(3).toString(),
	    			  list.get(6).toString(),list.get(8).toString(),list.get(9).toString(),
	    			  list.get(15).toString(),list.get(17).toString(),list.get(81).toString());
	    	  System.out.println(mes3.toString());
	    	  
	    	  int s3 = Insert_Msg3(mes3);
	    	  if(s3 > 0)
	    	  {
	    		  System.out.println("插入成功");
	    	  }
	    	  else
	    	  {
	    		  System.out.println("插入失败");
	    	  }
	    	  break;
	      case 4:
	    	  System.out.println("");
	    	  System.out.println("信息类型4");
	    	  break;
	      case 20:
	    	  System.out.println("");
	    	  System.out.println("信息类型20");
	    	  break;
	      default:
	    	  System.out.println("Error.信息类型未识别");
	    	  break;
	      }
	     
	      //向客户端输出
//	      os = socket.getOutputStream(); 
//	      byte[] bt1 = new byte[273];
//	      bt[0] = 4;
//	      bt[1] = (byte) 260;
//	      bt[2] = 0;
//	      bt[3] = 71;
//	      bt[4] = 1;
//	      bt[5] = 0;
//	      bt[6] = 7;
//	      bt[7] = 1;
//	      bt[8] = 0;
//	      bt[9] = (byte) 227;
//	      bt[10] = 7;
//	      bt[11] = 3;
//	      bt[12] = 1;
//	      bt[15] = (byte) 220;
//	      bt[16] = 0;
//        os.write(bt1); 
	      //}
	      
	    } catch (IOException e) { 
	      e.printStackTrace(); 
	    }finally { 
	        try {
				socket.shutdownInput();
				socket.shutdownOutput();
				 if(os != null)
		        	  os.close();
		          if (is != null) 
		            is.close(); 
		          if (socket != null) 
		            socket.close(); 
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    } 
	  } 
	  
	  
	  public int Insert_Msg1(Message1 msg)
	  {
		  String sql = "insert into Msg_Type1 values(?,?,?,?,?,?,?,?)";
		  int result = 0;
		  try {
		      pstmt = (PreparedStatement)connection.prepareStatement(sql);
		      pstmt.setInt(1, msg.getMsg_ID());
		      pstmt.setString(2, msg.getMsg_Type());
		      pstmt.setString(3, msg.getTransmitter_ID());
		      pstmt.setString(4, msg.getReceiver_ID());
		      pstmt.setString(5, msg.getDate());
		      pstmt.setString(6, msg.getTime());
		      pstmt.setString(7, msg.getAvailable());
		      pstmt.setString(8, msg.getStation_Type());
		      result = pstmt.executeUpdate();
             
		   } catch (SQLException e) {
		       e.printStackTrace();
		   }
		  return result;
	  }
	  
	  
	  public int Insert_Msg2(Message2 msg)
	  {
		  String sql = "insert into Msg_Type2 values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		  int result = 0;
		  try {
		      pstmt = (PreparedStatement)connection.prepareStatement(sql);
		      pstmt.setInt(1, msg.getMsg_ID());
		      pstmt.setString(2, msg.getMsg_Type());
		      pstmt.setString(3, msg.getTransmitter_ID());
		      pstmt.setString(4, msg.getReceiver_ID());
		      pstmt.setString(5, msg.getDate());
		      pstmt.setString(6, msg.getTime());
		      pstmt.setString(7, msg.getSensor_Latitude());
		      pstmt.setString(8, msg.getSensor_Longitude());
		      pstmt.setString(9, msg.getSensor_Type());
		      pstmt.setString(10, msg.getSensor_Type());
		      pstmt.setString(11, msg.getIntruder_Type());
		      pstmt.setString(12, msg.getSensor_ID());
		      pstmt.setString(13, msg.getAltitude());
		      result = pstmt.executeUpdate();
             
		   } catch (SQLException e) {
		       e.printStackTrace();
		   }
		  return result;
	  }
	  
	  
	  public int Insert_Msg3(Message3 msg)
	  {
		  String sql = "insert into Msg_Type3 values(?,?,?,?,?,?,?,?,?)";
		  int result = 0;
		  try {
		      pstmt = (PreparedStatement)connection.prepareStatement(sql);
		      pstmt.setInt(1, msg.getMsg_ID());
		      pstmt.setString(2, msg.getMsg_Type());
		      pstmt.setString(3, msg.getTransmitter_ID());
		      pstmt.setString(4, msg.getReceiver_ID());
		      pstmt.setString(5, msg.getDate());
		      pstmt.setString(6, msg.getTime());
		      pstmt.setString(7, msg.getGroup_ID());
		      pstmt.setString(8, msg.getGroup_Name());
		      pstmt.setString(9, msg.getGroup_State());
		      result = pstmt.executeUpdate();
             
		   } catch (SQLException e) {
		       e.printStackTrace();
		   }
		  return result;
	  }
	  
	  
}
