package MessageType;

import java.io.Serializable;

public class Message2 implements Serializable{
	
	private int Msg_ID;
	private String Msg_Type;
	private String Transmitter_ID;
	private String Receiver_ID;
	private String Date;
	private String Time;
	
	private String Sensor_Latitude;
	private String Sensor_Longitude;
	private String Sensor_State;
	private String Sensor_Type;
	private String Intruder_Type;
	private String Sensor_ID;
	private String Altitude;
	
	
	public Message2(int msg_ID, String msg_Type, String transmitter_ID, String receiver_ID, 
			String date, String time,String sensor_Latitude, String sensor_Longitude, 
			String sensor_State, String sensor_Type,String intruder_Type, 
			String sensor_ID, String altitude) {
		super();
		Msg_ID = msg_ID;
		Msg_Type = msg_Type;
		Transmitter_ID = transmitter_ID;
		Receiver_ID = receiver_ID;
		Date = date;
		Time = time;
		Sensor_Latitude = sensor_Latitude;
		Sensor_Longitude = sensor_Longitude;
		Sensor_State = sensor_State;
		Sensor_Type = sensor_Type;
		Intruder_Type = intruder_Type;
		Sensor_ID = sensor_ID;
		Altitude = altitude;
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


	public String getSensor_Latitude() {
		return Sensor_Latitude;
	}


	public void setSensor_Latitude(String sensor_Latitude) {
		Sensor_Latitude = sensor_Latitude;
	}


	public String getSensor_Longitude() {
		return Sensor_Longitude;
	}


	public void setSensor_Longitude(String sensor_Longitude) {
		Sensor_Longitude = sensor_Longitude;
	}


	public String getSensor_State() {
		return Sensor_State;
	}


	public void setSensor_State(String sensor_State) {
		Sensor_State = sensor_State;
	}


	public String getSensor_Type() {
		return Sensor_Type;
	}


	public void setSensor_Type(String sensor_Type) {
		Sensor_Type = sensor_Type;
	}


	public String getIntruder_Type() {
		return Intruder_Type;
	}


	public void setIntruder_Type(String intruder_Type) {
		Intruder_Type = intruder_Type;
	}


	public String getSensor_ID() {
		return Sensor_ID;
	}


	public void setSensor_ID(String sensor_ID) {
		Sensor_ID = sensor_ID;
	}


	public String getAltitude() {
		return Altitude;
	}


	public void setAltitude(String altitude) {
		Altitude = altitude;
	}


	@Override
	public String toString() {
		return "Message2 [Msg_ID=" + Msg_ID + ", Msg_Type=" + Msg_Type + ", Transmitter_ID=" + Transmitter_ID
				+ ", Receiver_ID=" + Receiver_ID + ", Date=" + Date + ", Time=" + Time + ", Sensor_Latitude="
				+ Sensor_Latitude + ", Sensor_Longitude=" + Sensor_Longitude + ", Sensor_State=" + Sensor_State
				+ ", Sensor_Type=" + Sensor_Type + ", Intruder_Type=" + Intruder_Type + ", Sensor_ID=" + Sensor_ID
				+ ", Altitude=" + Altitude + "]";
	}
	
 
	
	
}
