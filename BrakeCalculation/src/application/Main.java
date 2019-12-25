package application;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.Stage;
import vehicles.Vehicle;
import vehicles.Vehicle.Type;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	public static final int MAX_VEHICLES = 24;
	
	public static ArrayList<Vehicle> blockTrain = new ArrayList<>();
	
	public static Vehicle sampleVehicle = new Vehicle("Lok", Type.WORKING, 84, 19.4f, 4);
	
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Main.fxml"));
//			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("/layout/Vehicle.fxml"));
			Scene scene = new Scene(root);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setMaximized(true);
			primaryStage.setScene(scene);
			primaryStage.setResizable(true);
			primaryStage.show();
			primaryStage.setTitle("Bremsberechnung an Reisezügen");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}