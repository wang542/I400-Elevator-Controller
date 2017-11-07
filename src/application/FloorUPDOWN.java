package application;

public class FloorUPDOWN {

	private int Floor=0;
	private boolean up=false;
	private boolean down=false;
	
	public FloorUPDOWN() {
	}
	
	
	public FloorUPDOWN(int Floor,boolean up, boolean down) {
		this.Floor=Floor;
		this.up=up;
		this.down=down;
	
	}
	
	
	
	
	//Setter for floor number
	public void setFloor(int floor) {
		this.Floor=Floor;
	}
	
	
	//Setter for updown choice
	public void setUP(boolean up) {
		this.up=up;
	}
	
	public void setDown(boolean down) {
		this.down=down;
	}
	
	
	
	//toString method
	@Override
	public String toString() {
		String direction="";
		if(up==true)
			direction="UP";
		else if(down==true)
			direction="DOWN";
		
		String message=("Someone pressed button on "+Floor+" going "+direction);
	    System.out.println("in floor updown to string"+message);
		return message;
	}


	public boolean isUp() {
		return up;
	}


	public void setUp(boolean up) {
		this.up = up;
	}


	public int getFloor() {
		return Floor;
	}


	public boolean isDown() {
		return down;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
