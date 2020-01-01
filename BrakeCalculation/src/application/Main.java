package application;

import javafx.application.Application;
import javafx.stage.Stage;
import vehicles.BlockTrain;
import vehicles.Vehicle;
import vehicles.Vehicle.Type;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	public static final int MAX_VEHICLES = 24;
	
	public static BlockTrain blockTrain = new BlockTrain();
	
	private FXMLLoader loader;
	private BorderPane root;
	public static ControllerMain controller;
	
	public static Vehicle newDefaultWorkingTU() {
		return new Vehicle(-1, "Tfz", Type.WORKING, 0, 0, 4);
	}
	
	public static Vehicle newDefaultCoach() {
		return new Vehicle(-1, "Wagen", Type.COACH, 0, 0, 4);
	}	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {		
		try {
			loader = new FXMLLoader(getClass().getResource("Main.fxml"));
			root = loader.load();
			controller = loader.getController();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setMaximized(true);
			primaryStage.setScene(scene);
			primaryStage.setResizable(true);
			primaryStage.show();
			primaryStage.setTitle("Bremsberechnung an Reisezügen");

			
//			controller.addVehicleOn10();
			
			controller.addSampleVehicle();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}