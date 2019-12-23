package vehicles;

public class BrakePosition {
		
	public final Name name;
	private boolean active;
	private float brakeload;
	
	
	public BrakePosition(Name name, boolean active, float brakeload) {
		this.name = name;
		this.active = active;
		this.brakeload = brakeload;
	}
	
	public static enum Name {
		G,P,R,R_E,R_E160,R_Mg;
	}
}