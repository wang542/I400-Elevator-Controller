package application;

import java.io.IOException;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
	
	String direction = "Idle";
	boolean Status=false;
	ArrayList<FloorUPDOWN> floorupdown=new ArrayList();
	ArrayList<OnAndOff> Passenger=new ArrayList();
	ArrayList <Integer> upward = new ArrayList<>();
	ArrayList <Integer> downward = new ArrayList<>();
	ArrayList <Integer> currentSchedule = new ArrayList<>();
	Timeline timeline;
	int currentFloor = 1;
	
//	@FXML
//	public void FloorUPButtons(ActionEvent e) {
//		up=true;
//		down=false;
//		if(FloorOne.isSelected()) {
//			int floor=Integer.parseInt(FloorOne.getText());
//			
//			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
//			floorupdown.add(user);
//			System.out.println(user.toString());
//	} 
//		if(FloorTwo.isSelected()) {
//			int floor=Integer.parseInt(FloorTwo.getText());
//			
//			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
//			floorupdown.add(user);
//	}
//		if(FloorThree.isSelected()) {
//			int floor=Integer.parseInt(FloorThree.getText());
//			
//			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
//			floorupdown.add(user);
//	}
//		if(FloorFour.isSelected()) {
//			int floor=Integer.parseInt(FloorFour.getText());
//			
//			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
//			floorupdown.add(user);
//	}
//		if(FloorFive.isSelected()) {
//			int floor=Integer.parseInt(FloorFive.getText());
//			
//			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
//			floorupdown.add(user);
//	}
//		if(FloorSix.isSelected()) {
//			int floor=Integer.parseInt(FloorSix.getText());
//			
//			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
//			floorupdown.add(user);
//	}
//		
//		if(FloorEight.isSelected()) {
//			int floor=Integer.parseInt(FloorEight.getText());
//			
//			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
//			floorupdown.add(user);
//			System.out.println(user.toString());
//	}
//		if(FloorNine.isSelected()) {
//			int floor=Integer.parseInt(FloorNine.getText());
//			
//			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
//			floorupdown.add(user);
//	}
//		
//}
//	
//	@FXML
//	public void FloorDOWNButton(ActionEvent e) {
//		down=true;
//		up=false;
//		if(FloorTwo.isSelected()) {
//			int floor=Integer.parseInt(FloorTwo.getText());
//			
//			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
//			floorupdown.add(user);
//			//comment area
//	}
//		if(FloorThree.isSelected()) {
//			int floor=Integer.parseInt(FloorThree.getText());
//			
//			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
//			floorupdown.add(user);
//	}
//		if(FloorFour.isSelected()) {
//			int floor=Integer.parseInt(FloorFour.getText());
//			
//			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
//			floorupdown.add(user);
//	}
//		if(FloorFive.isSelected()) {
//			int floor=Integer.parseInt(FloorFive.getText());
//			
//			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
//			floorupdown.add(user);
//	}
//		if(FloorSix.isSelected()) {
//			int floor=Integer.parseInt(FloorSix.getText());
//			
//			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
//			floorupdown.add(user);
//	}
//		if(FloorSeven.isSelected()) {
//			int floor=Integer.parseInt(FloorSeven.getText());
//			
//			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
//			floorupdown.add(user);
//	}
//		if(FloorEight.isSelected()) {
//			int floor=Integer.parseInt(FloorEight.getText());
//			
//			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
//			floorupdown.add(user);
//			System.out.println(user.toString());
//	}
//		if(FloorNine.isSelected()) {
//			int floor=Integer.parseInt(FloorNine.getText());
//			
//			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
//			floorupdown.add(user);
//	}
//		if(FloorTen.isSelected()) {
//			int floor=Integer.parseInt(FloorTen.getText());
//			
//			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
//			floorupdown.add(user);
//			System.out.println(user.toString());
//			//comment area
//	}
//		
//		
//	}


	@FXML
	public void ButtonOneClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(One.getText());
		currentSchedule.add(floorgoing);
		process();
//		Status=true;
//		OnAndOff passenger=new OnAndOff(Status,floorgoing);
//		Passenger.add(passenger);
	}
	@FXML
	public void ButtonTwoClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Two.getText());
		currentSchedule.add(floorgoing);
		process();
//		Status=true;
//		OnAndOff passenger=new OnAndOff(Status,floorgoing);
//		Passenger.add(passenger);
	}
	@FXML
	public void ButtonThreeClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Three.getText());
		currentSchedule.add(floorgoing);
		process();
//		Status=true;
//		OnAndOff passenger=new OnAndOff(Status,floorgoing);
//		Passenger.add(passenger);
	}
	@FXML
	public void ButtonFourClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Four.getText());
		currentSchedule.add(floorgoing);
		process();
//		Status=true;
//		OnAndOff passenger=new OnAndOff(Status,floorgoing);
//		Passenger.add(passenger);
	}
	@FXML
	public void ButtonFiveClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Five.getText());
		currentSchedule.add(floorgoing);
		process();
//		Status=true;
//		OnAndOff passenger=new OnAndOff(Status,floorgoing);
//		Passenger.add(passenger);
	}
	@FXML
	public void ButtonSixClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Six.getText());
		currentSchedule.add(floorgoing);
		process();
//		Status=true;
//		OnAndOff passenger=new OnAndOff(Status,floorgoing);
//		Passenger.add(passenger);
	}
	@FXML
	public void ButtonSevenClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Seven.getText());
		currentSchedule.add(floorgoing);
		process();
//		Status=true;
//		OnAndOff passenger=new OnAndOff(Status,floorgoing);
//		Passenger.add(passenger);
	}
	@FXML
	public void ButtonEightClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Eight.getText());
		currentSchedule.add(floorgoing);
		process();
//		Status=true;
//		OnAndOff passenger=new OnAndOff(Status,floorgoing);
//		Passenger.add(passenger);
	}
	@FXML
	public void ButtonNineClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Nine.getText());
		currentSchedule.add(floorgoing);
		process();
//		Status=true;
//		OnAndOff passenger=new OnAndOff(Status,floorgoing);
//		Passenger.add(passenger);
	}
	@FXML
	public void ButtonTenClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Ten.getText());
		currentSchedule.add(floorgoing);
		process();
//		Status=true;
//		OnAndOff passenger=new OnAndOff(Status,floorgoing);
//		Passenger.add(passenger);
	}
	
	@FXML
	public void scheduleUpdate(ActionEvent event) {
		String container = "";
		
		for (int i = 0; i < Passenger.size(); i++) {
			ElevatorFloor.setText(Passenger.get(i).toString());
			container += Passenger.get(i).toString() + " ";
			ElevatorSchedule.setText(container);
			Passenger.remove(Passenger.get(i));
		}
	}
	
	public void process() {
		int floors = 0;
		floors = currentSchedule.get(0);
		if (currentFloor < floors) {
			direction = "Up";
			floors += 1;
			System.out.print("it works");
			
			
		}
		else if (currentFloor > floors) {
			direction = "Down";
			floors -= 1;
			System.out.print("it works");
		}
		else {
			//Something goes here
		}
		ElevatorGoing.setText(direction);
	}
	
	
	@FXML
	public void direction (ActionEvent event) {
		for (int i = 0; i < floorupdown.size(); i++) {
			if (floorupdown.get(i).isUp() == true) {
				ElevatorGoing.setText("Up");
			}
			else if(floorupdown.get(i).isDown() == true){
				ElevatorGoing.setText("Down");
			}
		}
	}
	
	@FXML
	public void initialize() {
		
		ElevatorFloor.setText(String.valueOf(currentFloor));
		ElevatorGoing.setText(direction);
//		// handle gets called every x time units specified in Duration.millis(x)
//		timeline = new Timeline(new KeyFrame(Duration.millis(3000), new EventHandler<ActionEvent>() {
//
//		    @Override
//		    public void handle(ActionEvent event) {
//		    	// put what you want to do after x time here
//		       
//		    }
//		}));
////		
////		// have the timeline loop infinitely
////		timeline.setCycleCount(Timeline.INDEFINITE);
////		// start the timeline
////		timeline.play();
	}
}
