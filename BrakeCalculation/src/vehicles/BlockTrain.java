package vehicles;

import java.util.ArrayList;

import application.Main;

public class BlockTrain extends ArrayList<Vehicle> {
	
	private static final long serialVersionUID = 3058471571369980113L;
	
	@Override
	public void add(int index, Vehicle vehicle) {
		System.out.println("there to add:" + index);
		int indexWhereToAdd;
		if (index >= Main.blockTrain.size()) {
			System.out.println("IF 1");
			indexWhereToAdd = Main.blockTrain.size();
			switch (vehicle.getType()) {
			case COACH:
				vehicle.setName("Wagen " + indexWhereToAdd);
				break;
			case WORKING:
			case NON_WORKING:
				vehicle.setName("Lok " + indexWhereToAdd);
				break;
			default:
				vehicle.setName("Fahrzeug " + indexWhereToAdd);
				break;
			}
			vehicle.setIndex(indexWhereToAdd);
//			Main.blockTrain.add(vehicle);
			super.add(vehicle);
			vehicle.addToGrid();
		}
		else {
			System.out.println("IF 2");
			indexWhereToAdd = index;
			switch (vehicle.getType()) {
			case COACH:
				vehicle.setName("Wagen " + indexWhereToAdd);
				break;
			case WORKING:
			case NON_WORKING:
				vehicle.setName("Lok " + indexWhereToAdd);
				break;
			default:
				vehicle.setName("Fahrzeug " + indexWhereToAdd);
				break;
			}
			vehicle.setIndex(indexWhereToAdd);
//			Main.blockTrain.add(index, vehicle);
			super.add(index, vehicle);
			for (int i = index+1; i < this.size(); i++) {
				this.get(i).setIndex(this.get(i).getIndex()+1);
			}
			vehicle.addToGrid();
		}
		
		System.out.println("Ausgabe BlockTrain:");
		for (int i = 0; i < this.size(); i++) {
			System.out.println(this.get(i).getIndex() + "i, " + this.get(i).getName() + ", " + this.get(i).getWeight());
		}
		System.out.println("ENDE, size=" + this.size());
	}
}
