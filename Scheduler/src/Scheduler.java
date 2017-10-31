package application;

import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.scene.control.RadioButton;
import java.util.ArrayList;

public class Scheduler {
	
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
	private TextField ElevatorSchedule;
	@FXML
	private TextField ElevatorFloor;
	@FXML
	private TextField ElevatorGoing;
	
//	private Stage panelStage;
//	private ElevatorPanelController panelController;
//	private Stage floorStage;
//	private floorUpDownController floorController;
	
	ArrayList<String> scheduleList = new ArrayList<>();
	
	//Example of logic: person on floor 1 wants to go floor 10.
	//person on floor 3 wants to got to floor 7.
	//First, figure out the direction the second individual wants to go first.
	//If they want to go up, move on to next step.
	//Otherwise, ignore the first person is at his new floor.
	//If going in same direction, compare the first user's destination to the second user.
	//Whoever has the smaller number, that user's choice is in front of the list.
	
	
	@FXML
	private void scheduleUpdate (ActionEvent event) {
		String container = "";
		for (String floor: scheduleList) {
			container += floor + " ";
			ElevatorSchedule.setText(container);
			delay();
		}
	}
	
	@FXML
	private void direction (ActionEvent event) {
		
	}
	
	@FXML
	private void currentFloor (ActionEvent event) {
		}
	
	public static void delay() {
		try {
			Thread.sleep(5000);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
}
