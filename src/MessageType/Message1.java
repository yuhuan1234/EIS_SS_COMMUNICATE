package MessageType;

import java.io.Serializable;

public class Message1 implements Serializable{
	
	private int Msg_ID;
	private String Msg_Type;
	private String Transmitter_ID;
	private String Receiver_ID;
	private String Date;
	private String Time;
	
	private String Available;//是否可用
	private String Station_Type ;//观测站类型
	
	public Message1(int msg_ID, String msg_Type, String transmitter_ID, String receiver_ID, 
			String date, String time,String available, String station_Type) {
		Msg_ID = msg_ID;
		Msg_Type = msg_Type;
		Transmitter_ID = transmitter_ID;
		Receiver_ID = receiver_ID;
		Date = date;
		Time = time;
		Available = available;
		Station_Type = station_Type;
	}

	public int getMsg_ID() {
		return Msg_ID;
	}

	public void setMsg_ID(int msg_ID) {
		Msg_ID = msg_ID;
	}

	public String getMsg_Type() {
		return Msg_Type;
	}

	public void setMsg_Type(String msg_Type) {
		Msg_Type = msg_Type;
	}

	public String getTransmitter_ID() {
		return Transmitter_ID;
	}

	public void setTransmitter_ID(String transmitter_ID) {
		Transmitter_ID = transmitter_ID;
	}

	public String getReceiver_ID() {
		return Receiver_ID;
	}

	public void setReceiver_ID(String receiver_ID) {
		Receiver_ID = receiver_ID;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public String getAvailable() {
		return Available;
	}

	public void setAvailable(String available) {
		Available = available;
	}

	public String getStation_Type() {
		return Station_Type;
	}

	public void setStation_Type(String station_Type) {
		Station_Type = station_Type;
	}

	@Override
	public String toString() {
		return "Message1 [Msg_ID=" + Msg_ID + ", Msg_Type=" + Msg_Type + ", Transmitter_ID=" + Transmitter_ID
				+ ", Receiver_ID=" + Receiver_ID + ", Date=" + Date + ", Time=" + Time + ", Available=" + Available
				+ ", Station_Type=" + Station_Type + "]";
	}
	
	
	
	
	
	
	
	

}
