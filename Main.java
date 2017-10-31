package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

//load the FXML
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("ELEVATOR!!!");
			
			FXMLLoader loader = new FXMLLoader();
			//Connect the main to FXML file
			loader.setLocation(Main.class.getResource("/ElevatorPanel.fxml"));
			AnchorPane mainLayout = (AnchorPane)loader.load();
			
			Scene scene= new Scene(mainLayout);
			primaryStage.setScene(scene);;
			primaryStage.show();
			scene.getRoot().requestFocus();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
