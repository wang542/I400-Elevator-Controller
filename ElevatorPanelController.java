package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class ElevatorPanelController {
	
	
	@FXML
	private RadioButton FloorOne;
	@FXML
	private RadioButton FloorTwo;
	@FXML
	private RadioButton FloorThree;
	@FXML
	private RadioButton FloorFour;
	@FXML
	private RadioButton FloorFive;
	@FXML
	private RadioButton FloorSix;
	@FXML
	private RadioButton FloorSeven;
	@FXML
	private RadioButton FloorEight;
	@FXML
	private RadioButton FloorNine;
	@FXML
	private RadioButton FloorTen;
	@FXML
	private Button FloorUP;
	@FXML
	private Button FloorDOWN;
	@FXML
	private Button One;
	@FXML
	private Button Two;
	@FXML
	private Button Three;
	@FXML
	private Button Four;
	@FXML
	private Button Five;
	@FXML
	private Button Six;
	@FXML
	private Button Seven;
	@FXML
	private Button Eight;
	@FXML
	private Button Nine;
	@FXML
	private Button Ten;
	@FXML
	private Button Open;
	@FXML
	private Button Close;
	@FXML
	private TextField ElevatorFloor;
	@FXML
	private TextField ElevatorGoing;
	@FXML
	private TextField ElevatorSchedule;
	
	boolean up=false;
	boolean down=false;
	boolean Status=false;
	int floorgoing = 0;
	ArrayList floorupdown=new ArrayList();
	ArrayList Passenger = new ArrayList();
	
	@FXML
	public void FloorUPButtons(ActionEvent e) {
		if(FloorOne.isSelected()) {
			int floor=Integer.parseInt(FloorOne.getText());
			up=true;
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
	} 
		if(FloorTwo.isSelected()) {
			int floor=Integer.parseInt(FloorTwo.getText());
			up=true;
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
	}
		if(FloorThree.isSelected()) {
			int floor=Integer.parseInt(FloorThree.getText());
			up=true;
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
	}
		if(FloorFour.isSelected()) {
			int floor=Integer.parseInt(FloorFour.getText());
			up=true;
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
	}
		if(FloorFive.isSelected()) {
			int floor=Integer.parseInt(FloorFive.getText());
			up=true;
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
	}
		if(FloorSix.isSelected()) {
			int floor=Integer.parseInt(FloorSix.getText());
			up=true;
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
	}
		
		if(FloorEight.isSelected()) {
			int floor=Integer.parseInt(FloorEight.getText());
			up=true;
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
	}
		if(FloorNine.isSelected()) {
			int floor=Integer.parseInt(FloorNine.getText());
			up=true;
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
	}
		
}
	
	@FXML
	public void FloorDOWNButton(ActionEvent e) {
		if(FloorTwo.isSelected()) {
			int floor=Integer.parseInt(FloorTwo.getText());
			down=true;
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
	}
		if(FloorThree.isSelected()) {
			int floor=Integer.parseInt(FloorThree.getText());
			down=true;
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
	}
		if(FloorFour.isSelected()) {
			int floor=Integer.parseInt(FloorFour.getText());
			down=true;
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
	}
		if(FloorFive.isSelected()) {
			int floor=Integer.parseInt(FloorFive.getText());
			down=true;
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
	}
		if(FloorSix.isSelected()) {
			int floor=Integer.parseInt(FloorSix.getText());
			down=true;
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
	}
		if(FloorSeven.isSelected()) {
			int floor=Integer.parseInt(FloorSeven.getText());
			down=true;
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
	}
		if(FloorEight.isSelected()) {
			int floor=Integer.parseInt(FloorEight.getText());
			down=true;
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
	}
		if(FloorNine.isSelected()) {
			int floor=Integer.parseInt(FloorNine.getText());
			down=true;
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
			
	}
		if(FloorTen.isSelected()) {
			int floor=Integer.parseInt(FloorTen.getText());
			down=true;
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
			System.out.println(user.toString());
	}
	
		
		
			
		
		
		
	}
	@FXML
	public void ButtonOneClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(One.getText());
		Status=true;
		OnAndOff passenger=new OnAndOff(Status,floorgoing);
		Passenger.add(passenger);
		}
	@FXML
	public void ButtonTwoClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Two.getText());
		Status=true;
		OnAndOff passenger=new OnAndOff(Status,floorgoing);
		Passenger.add(passenger);
		}
	@FXML
	public void ButtonThreeClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Three.getText());
		Status=true;
		OnAndOff passenger=new OnAndOff(Status,floorgoing);
		Passenger.add(passenger);
		}
	@FXML
	public void ButtonFourClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Four.getText());
		Status=true;
		OnAndOff passenger=new OnAndOff(Status,floorgoing);
		Passenger.add(passenger);
		}
	@FXML
	public void ButtonFiveClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Five.getText());
		Status=true;
		OnAndOff passenger=new OnAndOff(Status,floorgoing);
		Passenger.add(passenger);
		}
	@FXML
	public void ButtonSixClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Six.getText());
		Status=true;
		OnAndOff passenger=new OnAndOff(Status,floorgoing);
		Passenger.add(passenger);
		}
	@FXML
	public void ButtonSevenClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Seven.getText());
		Status=true;
		OnAndOff passenger=new OnAndOff(Status,floorgoing);
		Passenger.add(passenger);
		}
	@FXML
	public void ButtonEightClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Eight.getText());
		Status=true;
		OnAndOff passenger=new OnAndOff(Status,floorgoing);
		Passenger.add(passenger);
		}
	@FXML
	public void ButtonNineClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Nine.getText());
		Status=true;
		OnAndOff passenger=new OnAndOff(Status,floorgoing);
		Passenger.add(passenger);
		}
	@FXML
	public void ButtonTenClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Ten.getText());
		Status=true;
		OnAndOff passenger=new OnAndOff(Status,floorgoing);
		Passenger.add(passenger);
		System.out.println(passenger.toString());
		}
	
	
}
