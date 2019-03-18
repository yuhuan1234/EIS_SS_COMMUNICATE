package MessageType;

import java.io.Serializable;

public class Message4  implements Serializable{

	private int id;
	private String text;
	
	public Message4(){
		
	}
	public Message4(int id,String text){
		this.setId(id);
		this.setText(text);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
	
}
