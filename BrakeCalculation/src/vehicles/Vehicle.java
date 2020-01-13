package vehicles;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import layout.ControllerVehicle;

public class Vehicle {

	// Basic data
	private int index;
	private String name;
	private Type type;
	private float weight;
	private float length; // LüP
	private int axes;

	// Brake data
	private boolean pneumBrakeActive = true;
	private boolean dynamicBrakeActive = true;
	private boolean BrakePipeAcceleratorActive = true;
	private boolean AirSuspensionActive = true;

	// FXML
	private AnchorPane vehiclePane;
	private FXMLLoader loader;
	public ControllerVehicle controller;

	public Vehicle(int index, String name, Type type, float weight, float length, int axes) {

		this.index = index;
		this.name = name;
		this.type = type;
		this.weight = weight;
		this.length = length;
		this.axes = axes;
		if (this.axes != 2 && this.axes != 4 && this.axes != 6)
			this.axes = 4;

		try {
			loader = new FXMLLoader(getClass().getResource("/layout/Vehicle.fxml"));
			vehiclePane = loader.load();
			controller = loader.getController();
			controller.setVehicle(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
		controller.vName.setText(this.name);
	}

	// FXML
	public void showVehiclePane(boolean value) {
		vehiclePane.setVisible(value);
	}

	public void addToGrid() {
		System.out.println("Add to grid with index " + index);
		if (this.index >= 0) {
			Main.controller.addVehiclePaneToGrid(this.index, this.vehiclePane);
			showVehiclePane(true);
		}
		else if(this.index == -1) throw new IllegalArgumentException("Index == -1. Cannot be added to grid");
	}
	
	public void removeFromGrid() {
		Main.controller.trainGridPane.getChildren().remove(this.vehiclePane);
		
	}
	
	private void updateVehiclePane() {
		controller.vName.setText(this.name);
		controller.vWeightAxes.setText(this.weight + " t, " + this.axes + "x");
		controller.vLength.setText(this.length + " m");
		// ...
		
		// update footer
		Main.controller.fTotalLengthCoaches.setText(Main.blockTrain.getTotalLengthOfCoaches() + " m");
		Main.controller.fTotalWeightCoaches.setText(Main.blockTrain.getTotalWeightOfCoaches() + " t");
		Main.controller.fTotalLengthWorkingTU.setText(Main.blockTrain.getTotalLengthOfWorkingTU() + " m");
		Main.controller.fTotalWeightWorkingTU.setText(Main.blockTrain.getTotalWeightOfWorkingTU() + " t");
		Main.controller.fTotalLengthTotal.setText(Main.blockTrain.getTotalLength() + " m");
		Main.controller.fTotalWeightTotal.setText(Main.blockTrain.getTotalWeight() + " t");
	}
	
	
	
	

	// simple setters & getters |->

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws IllegalArgumentException {
		if (name == null)
			throw new IllegalArgumentException("Name cannot be null");
		this.name = name;
		updateVehiclePane();
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
		updateVehiclePane();
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		if (weight < 0)
			throw new IllegalArgumentException("Weight must be at least zero");
		this.weight = weight;
		updateVehiclePane();
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		if (length < 0)
			throw new IllegalArgumentException("Length must be greater than zero");
		this.length = length;
		updateVehiclePane();
	}

	public int getAxes() {
		return axes;
	}

	public void setAxes(int axes) {
		if (axes != 2 && axes != 4 && axes != 6)
			throw new IllegalArgumentException("Axes must be 2, 4 or 6");
		this.axes = axes;
		updateVehiclePane();
	}

	public boolean isPneumBrakeActive() {
		return pneumBrakeActive;
	}

	public void setPneumBrakeActive(boolean pneumBrakeActive) {
		this.pneumBrakeActive = pneumBrakeActive;
		updateVehiclePane();
	}

	public boolean isDynamicBrakeActive() {
		return dynamicBrakeActive;
	}

	public void setDynamicBrakeActive(boolean dynamicBrakeActive) {
		this.dynamicBrakeActive = dynamicBrakeActive;
		updateVehiclePane();
	}

	public boolean isBrakePipeAcceleratorActive() {
		return BrakePipeAcceleratorActive;
	}

	public void setBrakePipeAcceleratorActive(boolean brakePipeAcceleratorActive) {
		BrakePipeAcceleratorActive = brakePipeAcceleratorActive;
		updateVehiclePane();
	}

	public boolean isAirSuspensionActive() {
		return AirSuspensionActive;
	}

	public void setAirSuspensionActive(boolean airSuspensionActive) {
		AirSuspensionActive = airSuspensionActive;
		updateVehiclePane();
	}

	public static enum Type {
		
		WORKING("arb. Tfz"), NON_WORKING("n. arb. Tfz"), COACH("Wagen");
		
		final String text;
		
		private Type(String s) {
			text = s;
		}
		
		public String toString() {
			return text;
		}
	}
}