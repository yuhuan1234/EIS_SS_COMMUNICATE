package MessageType;

import java.io.Serializable;

public class Message20   implements Serializable{

	private int TargetType;

	
	
	public Message20() {
	}


	public Message20(int targetType) {
		TargetType = targetType;
	}



	public int getTargetType() {
		return TargetType;
	}

	public void setTargetType(int targetType) {
		TargetType = targetType;
	}
	
	
}
