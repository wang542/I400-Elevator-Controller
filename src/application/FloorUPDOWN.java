package application;

public class FloorUPDOWN {

	private int Floor=0;
	private boolean up=false;
	private boolean down=false;
	
	public FloorUPDOWN() {
	}
	
	
	public FloorUPDOWN(int Floor,boolean up, boolean down) {
		Floor=this.Floor;
		up=this.up;
		down=this.down;
	
	}
	
	public FloorUPDOWN(int Floor, boolean down) {
		Floor=this.Floor;
		down=this.down;
	}
	
	
	//Setter for floor number
	public void setFloor(int floor) {
		Floor=this.Floor;
	}
	
	
	//Setter for updown choice
	public void setUP(boolean up) {
		up=this.up;
	}
	
	public void setDown(boolean down) {
		down=this.down;
	}
	
	//toString method
	public String toString() {
		String direction="";
		if(up=true)
			direction="UP";
		else if(down=true)
			direction="DOWN";
		
		String message=("Someone pressed button on "+Floor+" going "+direction);
		return message;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
