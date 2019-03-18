package MessageType;

import java.io.Serializable;

public class Message3 implements Serializable{

	private int Msg_ID;
	private String Msg_Type;
	private String Transmitter_ID;
	private String Receiver_ID;
	private String Date;
	private String Time;
	
	private String Group_ID;
	private String Group_Name;
	private String Group_State;
	
	public Message3(int msg_ID, String msg_Type, String transmitter_ID, String receiver_ID, 
			String date, String time,String group_ID, String group_Name, String group_State) {
		super();
		Msg_ID = msg_ID;
		Msg_Type = msg_Type;
		Transmitter_ID = transmitter_ID;
		Receiver_ID = receiver_ID;
		Date = date;
		Time = time;
		Group_ID = group_ID;
		Group_Name = group_Name;
		Group_State = group_State;
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

	public String getGroup_ID() {
		return Group_ID;
	}

	public void setGroup_ID(String group_ID) {
		Group_ID = group_ID;
	}

	public String getGroup_Name() {
		return Group_Name;
	}

	public void setGroup_Name(String group_Name) {
		Group_Name = group_Name;
	}

	public String getGroup_State() {
		return Group_State;
	}

	public void setGroup_State(String group_State) {
		Group_State = group_State;
	}

	@Override
	public String toString() {
		return "Message3 [Msg_ID=" + Msg_ID + ", Msg_Type=" + Msg_Type + ", Transmitter_ID=" + Transmitter_ID
				+ ", Receiver_ID=" + Receiver_ID + ", Date=" + Date + ", Time=" + Time + ", Group_ID=" + Group_ID
				+ ", Group_Name=" + Group_Name + ", Group_State=" + Group_State + "]";
	}
	
	
	
}
