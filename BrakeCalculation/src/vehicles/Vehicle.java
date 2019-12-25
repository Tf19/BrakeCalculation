package vehicles;

public class Vehicle {
	
	// Basic data
	public String name;
	private Type type;
	private float weight;
	private float length; // LüP
	private int axes;
	
	// Brake data
	public boolean pneumBrakeActive = true;
	public boolean dynamicBrakeActive = true; 
	public boolean BrakePipeAcceleratorActive = true;
	public boolean AirSuspensionActive = true;
	
	public Vehicle(String name, Type type, float weight, float length, int axes) {
		setName(name);
		setType(type);
		setWeight(weight);
		setLength(length);
		setAxes(axes);
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) throws IllegalArgumentException {
		if(name == null) throw new IllegalArgumentException("Name cannot be null");
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
		if(weight <= 0) throw new IllegalArgumentException("Weight must be greater than zero");
		this.weight = weight;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		if(length <= 0) throw new IllegalArgumentException("Length must be greater than zero");
		this.length = length;
	}

	public int getAxes() {
		return axes;
	}

	public void setAxes(int axes) {
		if(axes < 2) throw new IllegalArgumentException("Axes must be at least 2");
		this.axes = axes;
	}

	public static enum Type {
		WORKING, NOT_WORKING, COACH;
	}
}