package vehicles;

import java.util.ArrayList;

import application.Main;
import vehicles.Vehicle.Type;

public class BlockTrain extends ArrayList<Vehicle> {

	private static final long serialVersionUID = 3058471571369980113L;

	@Override
	public void add(int index, Vehicle vehicle) {
		int indexWhereToAdd;
		if (index >= Main.blockTrain.size()) {
			indexWhereToAdd = Main.blockTrain.size();
			switch (vehicle.getType()) {
			case COACH:
				vehicle.setName("Wagen");
				break;
			case WORKING:
			case NON_WORKING:
				vehicle.setName("Tfz");
				break;
			default:
				vehicle.setName("Fahrzeug");
				break;
			}
			vehicle.setIndex(indexWhereToAdd);
			super.add(vehicle);
			vehicle.addToGrid();
		} else {
			indexWhereToAdd = index;
			switch (vehicle.getType()) {
			case COACH:
				vehicle.setName("Wagen");
				break;
			case WORKING:
			case NON_WORKING:
				vehicle.setName("Tfz");
				break;
			default:
				vehicle.setName("Fahrzeug");
				break;
			}
			vehicle.setIndex(indexWhereToAdd);
			super.add(index, vehicle);
			vehicle.addToGrid();
		}
		vehicle.controller.select();
//		for (int i = 0; i < this.size(); i++) {
//			System.out.println(this.get(i).getIndex() + "i, " + this.get(i).getName() + ", " + this.get(i).getWeight());
//		}
	}

	public Vehicle remove(int index) {
		get(index).removeFromGrid();
		return super.remove(index);
	}

	public void clear() {
		for (Vehicle vehicle : this)
			vehicle.removeFromGrid();
		super.clear();
		Main.controller.setSelectedVehicle(null);
		System.out.println("Currently selected vehicle: " + Main.controller.getSelectedVehicle());
	}

	public boolean containsCoaches() {
		boolean returnValue = false;
		for (Vehicle vehicle : this) {
			if (vehicle.getType() == Type.COACH)
				returnValue = true;
		}
		return returnValue;
	}

	public boolean containsWorkingTractionUnit() {
		boolean returnValue = false;
		for (Vehicle vehicle : this) {
			if (vehicle.getType() == Type.WORKING)
				returnValue = true;
		}
		return returnValue;
	}

	public float getTotalWeight() {
		float weight = 0;
		for (Vehicle vehicle : this) {
			weight += vehicle.getWeight();
		}
		return weight;
	}

	public float getTotalLength() {
		float length = 0;
		for (Vehicle vehicle : this) {
			length += vehicle.getLength();
		}
		return length;
	}

	public int getTotalAxes() {
		int axes = 0;
		for (Vehicle vehicle : this) {
			axes += vehicle.getAxes();
		}
		return axes;
	}

	public float getTotalWeightOfCoaches() {
		float weight = 0;
		for (Vehicle vehicle : this) {
			if (vehicle.getType() == Type.COACH || vehicle.getType() == Type.NON_WORKING)
				weight += vehicle.getWeight();
		}
		return weight;
	}
	
	public float getTotalLengthOfCoaches() {
		float length = 0;
		for (Vehicle vehicle : this) {
			if (vehicle.getType() == Type.COACH || vehicle.getType() == Type.NON_WORKING)
				length += vehicle.getLength();
		}
		return length;
	}
	
	public int getTotalAxesOfCoaches() {
		int axes = 0;
		for (Vehicle vehicle : this) {
			if (vehicle.getType() == Type.COACH || vehicle.getType() == Type.NON_WORKING)
				axes += vehicle.getAxes();
		}
		return axes;
	}
	
	public float getTotalWeightOfWorkingTU() {
		float weight = 0;
		for (Vehicle vehicle : this) {
			if (vehicle.getType() == Type.WORKING)
				weight += vehicle.getWeight();
		}
		return weight;
	}
	
	public float getTotalLengthOfWorkingTU() {
		float length = 0;
		for (Vehicle vehicle : this) {
			if (vehicle.getType() == Type.WORKING)
				length += vehicle.getLength();
		}
		return length;
	}
	
	public int getTotalAxesOfWorkingTU() {
		int axes = 0;
		for (Vehicle vehicle : this) {
			if (vehicle.getType() == Type.WORKING)
				axes += vehicle.getAxes();
		}
		return axes;
	}
}
