package MessageType;

import java.io.Serializable;

public class Message implements Serializable{
	
	private String MesType;
	private int length;
	private String transmitter;
	private int transmitter_id;
	private String receiver;
	private int receiver_id;
	private int year;
	private int month;
	private int day;
	
	public Message()
	{	
	}//无参构造
	public Message(String mesType, int length, String transmitter, int transmitter_id, String receiver, int receiver_id,
			int year, int month, int day) {
		this.setMesType(mesType);
		this.setLength(length);
		this.setTransmitter(transmitter);
		this.setTransmitter_id(transmitter_id);
		this.setReceiver(receiver);
		this.setReceiver_id(receiver_id);
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
		
	}//带参
	
	
	public String getMesType() {
		return MesType;
	}
	public void setMesType(String mesType) {
		MesType = mesType;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getTransmitter() {
		return transmitter;
	}
	public void setTransmitter(String transmitter) {
		this.transmitter = transmitter;
	}
	public int getTransmitter_id() {
		return transmitter_id;
	}
	public void setTransmitter_id(int transmitter_id) {
		this.transmitter_id = transmitter_id;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public int getReceiver_id() {
		return receiver_id;
	}
	public void setReceiver_id(int receiver_id) {
		this.receiver_id = receiver_id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	

	
}
