package application;

import java.io.IOException;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import java.util.ArrayList;


import javafx.event.ActionEvent;
import javafx.event.Event;
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
	private TextField ElevatorOn;
	@FXML
	private TextField ElevatorGoing;
	@FXML
	private TextField ElevatorSchedule;
	
	String direction = "Idle";
	boolean up=false;
	boolean down=false;
	boolean Status=false;
	ArrayList<FloorUPDOWN> floorupdown=new ArrayList();
	ArrayList <Integer> upward = new ArrayList<>();
	ArrayList <Integer> downward = new ArrayList<>();
	ArrayList <Integer> currentSchedule = new ArrayList<>();
	Timeline timeline = new Timeline();
	int currentFloor = 1;
	
	//This represents the choices the user can choose from outside of the elevator, specifically for the up button.
	//left panel
	@FXML
	public void FloorUPButtons(ActionEvent e) {
		up=true;
		down=false;
		if(FloorOne.isSelected()) {
			int floor=Integer.parseInt(FloorOne.getText());
			
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
			currentSchedule.add(1);
			ElevatorSchedule.setText(String.valueOf(currentSchedule));
			process();
	} 
		if(FloorTwo.isSelected()) {
			int floor=Integer.parseInt(FloorTwo.getText());
			
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
			currentSchedule.add(2);
			ElevatorSchedule.setText(String.valueOf(currentSchedule));
			process();
	}
		if(FloorThree.isSelected()) {
			int floor=Integer.parseInt(FloorThree.getText());
			
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
			currentSchedule.add(3);
			ElevatorSchedule.setText(String.valueOf(currentSchedule));
			process();
	}
		if(FloorFour.isSelected()) {
			int floor=Integer.parseInt(FloorFour.getText());
			
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
			currentSchedule.add(4);
			ElevatorSchedule.setText(String.valueOf(currentSchedule));
			process();
	}
		if(FloorFive.isSelected()) {
			int floor=Integer.parseInt(FloorFive.getText());
			
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
			currentSchedule.add(5);
			ElevatorSchedule.setText(String.valueOf(currentSchedule));
			process();
	}
		if(FloorSix.isSelected()) {
			int floor=Integer.parseInt(FloorSix.getText());
			
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
			currentSchedule.add(6);
			ElevatorSchedule.setText(String.valueOf(currentSchedule));
			process();
	}
		if(FloorSeven.isSelected()) {
			int floor=Integer.parseInt(FloorSeven.getText());
			
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
			currentSchedule.add(7);
			ElevatorSchedule.setText(String.valueOf(currentSchedule));
			process();
	}
		if(FloorEight.isSelected()) {
			int floor=Integer.parseInt(FloorEight.getText());
			
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
			currentSchedule.add(8);
			ElevatorSchedule.setText(String.valueOf(currentSchedule));
			process();
	}
		if(FloorNine.isSelected()) {
			int floor=Integer.parseInt(FloorNine.getText());
			
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
			currentSchedule.add(9);
			ElevatorSchedule.setText(String.valueOf(currentSchedule));
			process();
	}
		direction();	
}
	
	//This represents the choices the user can choose from outside of the elevator, specifically for the down button.
	//left panel
	@FXML
	public void FloorDOWNButtons(ActionEvent e) {
		down=true;
		up=false;
		if(FloorTwo.isSelected()) {
			int floor=Integer.parseInt(FloorTwo.getText());
			
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
			currentSchedule.add(2);
			ElevatorSchedule.setText(String.valueOf(currentSchedule));
			process();
	}
		if(FloorThree.isSelected()) {
			int floor=Integer.parseInt(FloorThree.getText());
			
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
			currentSchedule.add(3);
			ElevatorSchedule.setText(String.valueOf(currentSchedule));
			process();
	}
		if(FloorFour.isSelected()) {
			int floor=Integer.parseInt(FloorFour.getText());
			
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
			currentSchedule.add(4);
			ElevatorSchedule.setText(String.valueOf(currentSchedule));
			process();
	}
		if(FloorFive.isSelected()) {
			int floor=Integer.parseInt(FloorFive.getText());
			
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
			currentSchedule.add(5);
			ElevatorSchedule.setText(String.valueOf(currentSchedule));
			process();
	}
		if(FloorSix.isSelected()) {
			int floor=Integer.parseInt(FloorSix.getText());
			
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
			currentSchedule.add(6);
			ElevatorSchedule.setText(String.valueOf(currentSchedule));
			process();
	}
		if(FloorSeven.isSelected()) {
			int floor=Integer.parseInt(FloorSeven.getText());
			
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
			currentSchedule.add(7);
			ElevatorSchedule.setText(String.valueOf(currentSchedule));
			process();
	}
		if(FloorEight.isSelected()) {
			int floor=Integer.parseInt(FloorEight.getText());
			
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
			currentSchedule.add(8);
			ElevatorSchedule.setText(String.valueOf(currentSchedule));
			process();
	}
		if(FloorNine.isSelected()) {
			int floor=Integer.parseInt(FloorNine.getText());
			
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
			currentSchedule.add(9);
			ElevatorSchedule.setText(String.valueOf(currentSchedule));
			process();
	}
		if(FloorTen.isSelected()) {
			int floor=Integer.parseInt(FloorTen.getText());
			
			FloorUPDOWN user=new FloorUPDOWN(floor,up,down);
			floorupdown.add(user);
			currentSchedule.add(10);
			ElevatorSchedule.setText(String.valueOf(currentSchedule));
			process();
	}
		direction();	
	}

	//These are for inside the elevator. Each button has their own method that adds to the schedule and calls process.
	//Middle panel
	@FXML
	public void ButtonOneClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(One.getText());
		currentSchedule.add(floorgoing);
		ElevatorSchedule.setText(String.valueOf(currentSchedule));
		process();
	}
	@FXML
	public void ButtonTwoClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Two.getText());
		currentSchedule.add(floorgoing);
		ElevatorSchedule.setText(String.valueOf(currentSchedule));
		process();
	}
	@FXML
	public void ButtonThreeClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Three.getText());
		currentSchedule.add(floorgoing);
		ElevatorSchedule.setText(String.valueOf(currentSchedule));
		process();
	}
	@FXML
	public void ButtonFourClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Four.getText());
		currentSchedule.add(floorgoing);
		ElevatorSchedule.setText(String.valueOf(currentSchedule));
		process();
	}
	@FXML
	public void ButtonFiveClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Five.getText());
		currentSchedule.add(floorgoing);
		ElevatorSchedule.setText(String.valueOf(currentSchedule));
		process();
	}
	@FXML
	public void ButtonSixClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Six.getText());
		currentSchedule.add(floorgoing);
		ElevatorSchedule.setText(String.valueOf(currentSchedule));
		process();
	}
	@FXML
	public void ButtonSevenClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Seven.getText());
		currentSchedule.add(floorgoing);
		ElevatorSchedule.setText(String.valueOf(currentSchedule));
		process();
	}
	@FXML
	public void ButtonEightClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Eight.getText());
		currentSchedule.add(floorgoing);
		ElevatorSchedule.setText(String.valueOf(currentSchedule));
		process();
	}
	@FXML
	public void ButtonNineClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Nine.getText());
		currentSchedule.add(floorgoing);
		ElevatorSchedule.setText(String.valueOf(currentSchedule));
		process();
	}
	@FXML
	public void ButtonTenClick(ActionEvent event) {
		int floorgoing=Integer.parseInt(Ten.getText());
		currentSchedule.add(floorgoing);
		ElevatorSchedule.setText(String.valueOf(currentSchedule));
		process();
	}
	
	//Methods used to update direction from user that is outside the elevator (left panel)
	public void direction () {
		for (int i = 0; i < floorupdown.size(); i++) {
			if (floorupdown.get(i).isUp() == true) {
				direction = "Up";
				ElevatorGoing.setText(direction);
				upward.add(floorupdown.get(i).getFloor());
			}
			else if(floorupdown.get(i).isDown() == true){
				direction = "Down";
				ElevatorGoing.setText(direction);
				downward.add(floorupdown.get(i).getFloor());
			}
		}
	}
	
	//Main method for updating Elevator On and Going text fields
	public void process() {
		int floors = 0;
		floors = currentSchedule.get(0);
		ElevatorOn.setText(String.valueOf(currentFloor));
		if (timeline.getStatus() == Animation.Status.STOPPED) {
			if (currentFloor < floors) {
				direction = "Up";
				ElevatorGoing.setText(direction);
				upward.add(floors);
				
				createTimeline(Math.abs(floors - currentFloor));
				timeline.play();
				System.out.println(timeline.getStatus());
			}
			
			else if (currentFloor > floors) {
				direction = "Down";
				ElevatorGoing.setText(direction);
				downward.add(floors);
				
				createTimeline(Math.abs(currentFloor - floors));
				timeline.play();
				System.out.println(timeline.getStatus());
				
			}
		}
	}
	
	//This method creates out our delay in time to simulate an elevator moving up/down one floor at a time.
	//It also provides other functions that rely on time delay. 
	public void createTimeline(int numFloors) {
		KeyFrame oneSec = new KeyFrame(Duration.millis(1000 + (numFloors * 1000)));
		//Creates key frames
		for (int i = 0; i < numFloors; i++) {
		
			KeyFrame kf = new KeyFrame(Duration.millis(1000 + (i*1000)), new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					if (direction.equals("Up")) {
						currentFloor += 1;
					}
					else if (direction.equals("Down")) {
						currentFloor -= 1;
					}
					System.out.println(currentFloor);
					ElevatorOn.setText(String.valueOf(currentFloor));
				}
			});
			timeline.getKeyFrames().add(kf);	
		}
		timeline.getKeyFrames().add(oneSec);
		timeline.setOnFinished(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//Clears current keyframes previously used
				timeline.getKeyFrames().clear();
				//Removes most recent destination for list
				currentSchedule.remove(0);
				//Updates schedule text field
				ElevatorSchedule.setText(String.valueOf(currentSchedule));
				//If the schedule list is not empty, o back to process method
				if (!currentSchedule.isEmpty()) {
					process();
				}
			}
			
		});
	}
}
