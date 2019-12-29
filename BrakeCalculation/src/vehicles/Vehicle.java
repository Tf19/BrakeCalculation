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

//		setName(name);
//		setType(type);
//		setWeight(weight);
//		setLength(length);
//		setAxes(axes);
		try {
//			vehiclePane = (AnchorPane) FXMLLoader.load(getClass().getResource("/layout/Vehicle.fxml"));
			loader = new FXMLLoader(getClass().getResource("/layout/Vehicle.fxml"));
			vehiclePane = loader.load();
			controller = loader.getController();
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
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		if (weight <= 0)
			throw new IllegalArgumentException("Weight must be greater than zero");
		this.weight = weight;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		if (length <= 0)
			throw new IllegalArgumentException("Length must be greater than zero");
		this.length = length;
	}

	public int getAxes() {
		return axes;
	}

	public void setAxes(int axes) {
		if (axes != 2 && axes != 4 && axes != 6)
			throw new IllegalArgumentException("Axes must be 2, 4 or 6");
		this.axes = axes;
	}

	public boolean isPneumBrakeActive() {
		return pneumBrakeActive;
	}

	public void setPneumBrakeActive(boolean pneumBrakeActive) {
		this.pneumBrakeActive = pneumBrakeActive;
	}

	public boolean isDynamicBrakeActive() {
		return dynamicBrakeActive;
	}

	public void setDynamicBrakeActive(boolean dynamicBrakeActive) {
		this.dynamicBrakeActive = dynamicBrakeActive;
	}

	public boolean isBrakePipeAcceleratorActive() {
		return BrakePipeAcceleratorActive;
	}

	public void setBrakePipeAcceleratorActive(boolean brakePipeAcceleratorActive) {
		BrakePipeAcceleratorActive = brakePipeAcceleratorActive;
	}

	public boolean isAirSuspensionActive() {
		return AirSuspensionActive;
	}

	public void setAirSuspensionActive(boolean airSuspensionActive) {
		AirSuspensionActive = airSuspensionActive;
	}

	public static enum Type {
		WORKING, NON_WORKING, COACH;
	}
}