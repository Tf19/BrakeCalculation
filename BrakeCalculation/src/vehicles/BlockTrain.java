package vehicles;

import java.util.ArrayList;

import application.Main;
import vehicles.Vehicle.Type;

public class BlockTrain extends ArrayList<Vehicle> {

	private static final long serialVersionUID = 3058471571369980113L;

	@Override
	public void add(int index, Vehicle vehicle) {
//		System.out.println("there to add:" + index);
		int indexWhereToAdd;
		if (index >= Main.blockTrain.size()) {
//			System.out.println("IF 1");
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
//			Main.blockTrain.add(vehicle);
			super.add(vehicle);
			vehicle.addToGrid();
		} else {
//			System.out.println("IF 2");
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
//			Main.blockTrain.add(index, vehicle);
			super.add(index, vehicle);
			for (int i = index + 1; i < this.size(); i++) {
//				this.get(i).setIndex(this.get(i).getIndex()+1);
			}
			vehicle.addToGrid();
		}
		vehicle.controller.select();
		System.out.println("Ausgabe BlockTrain:");
		for (int i = 0; i < this.size(); i++) {
			System.out.println(this.get(i).getIndex() + "i, " + this.get(i).getName() + ", " + this.get(i).getWeight());
		}
//		System.out.println("ENDE, size=" + this.size());
	}

	public Vehicle remove(int index) {
		get(index).removeFromGrid();
		return super.remove(index);
	}

	public void clear() {
		for (Vehicle vehicle : this)
			vehicle.removeFromGrid();
		super.clear();
	}
	
	public boolean containsCoaches() {
		boolean returnValue = false;
		for (Vehicle vehicle : this) {
			if(vehicle.getType() == Type.COACH) returnValue = true;
		}
		return returnValue;
	}
	
	public boolean containsWorkingTractionUnit() {
		boolean returnValue = false;
		for (Vehicle vehicle : this) {
			if(vehicle.getType() == Type.WORKING) returnValue = true;
		}
		return returnValue;
	}
}
