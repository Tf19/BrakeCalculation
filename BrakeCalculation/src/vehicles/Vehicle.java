package vehicles;

public abstract class Vehicle {
	
	private float length; // LüP
	private float weight;
	private int axes;
	
	private Type type;
	
	public String name;
	
	public boolean brakeActive = true;
	
	public static enum Type {
		WORKING_TU, NOT_WORKING_TU, COACH;
	}
}