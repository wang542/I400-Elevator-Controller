package application;

public class OnAndOff{
	private boolean Status = false;
	private int Floor = 0;
	
	// No-arg constructor
	public OnAndOff() {
	}
	
	public OnAndOff(boolean Status, int Floor) {
		 // invokes the superclass constructor
		this.Status = Status;
		this.Floor = Floor;
	}
	
	
	
	// access method
	public void getStatus(boolean Status) {
		Status=this.Status;
	}
	public void getFloor(int Floor) {
		Floor=this.Floor;
	}
	@Override
	public String toString() {
		String Message=(Floor +" is current "+Status);
		return Message;
	}
}