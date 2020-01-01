package layout;

import application.ControllerMain;
import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import vehicles.Vehicle;

public class ControllerVehicle {

	@FXML
	public AnchorPane anchorPane;
	@FXML
	public Label vName;

	private boolean isSelected;
	private Vehicle vehicle;

	@FXML
	public void select() {
		deselectAll();
		setSelected(true);
	}

	public void setSelected(boolean value) {
		isSelected = value;
		if (value) {
			Main.controller.setSelectedVehicle(vehicle);
			anchorPane.setStyle("-fx-background-color:  #fca8b6;");
		} else {
			if (Main.controller.getSelectedVehicle() == vehicle)
				Main.controller.setSelectedVehicle(null);
			anchorPane.setStyle("-fx-background-color:  #f0f0f0;");
		}
	}

	public boolean isSelected() {
		return isSelected;
	}

	private void deselectAll() {
		for (Vehicle vehicle : Main.blockTrain) {
			vehicle.controller.setSelected(false);
		}
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}