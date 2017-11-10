package application;

public class FloorUPDOWN {

	private int Floor=0;
	private boolean up=false;
	private boolean down=false;
	
	public FloorUPDOWN() {
	//empty constructor
		}
	
	
	public FloorUPDOWN(int Floor,boolean up, boolean down) {
		this.Floor=Floor;
		this.up=up;
		this.down=down;
	//constructor for creating object
	}
	
	
	
	
	//Setter for floor number
	public void setFloor(int floor) {
		this.Floor=Floor;
	}
	
	
	//Setter for updown choice
	public void setUP(boolean up) {
		this.up=up;
	}
	
	//setter for down boolean value
	public void setDown(boolean down) {
		this.down=down;
	}
	
	
	
	//toString method
	@Override
	public String toString() {
		//check boolean status between up and down 
		String direction="";
		if(up==true)
			direction="UP";
		else if(down==true)
			direction="DOWN";
		
		String message=("Someone pressed button on "+Floor+" going "+direction);
	    System.out.println("in floor updown to string"+message);
		return message;
	}

	//getter for up
	public boolean isUp() {
		return up;
	}

	//setter for up
	public void setUp(boolean up) {
		this.up = up;
	}

	//getter for floor number
	public int getFloor() {
		return Floor;
	}

	//getter for down boolean
	public boolean isDown() {
		return down;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
