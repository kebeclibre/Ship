import java.util.ArrayList;

public class Ship extends Vehicle {
	private static int MAX_SPACE=100;
	private static int MAX_WEIGHT=95000;
	private ArrayList<Vehicle> load = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle vehicle) {
		if (findSpot(vehicle)) {load.add(vehicle); }
		else {System.out.println("error");};
	}
	
	private boolean findSpot(Vehicle vehicle) {
		if (load.size() < MAX_SPACE) {	
			if (totalWeight() < MAX_WEIGHT) {
				return true;
			}else{ return false; }
		}else{return false; }
	}

	
	public void removeVehicle(Vehicle vehicle) {
		if (load.size() > 0 && load.contains(vehicle)) {
			if (load.contains(vehicle)) {load.remove(vehicle); }
		}
	}
	
	public int totalWeight() {
		int total=0;
		for (Vehicle vehicle : load) {
			total += vehicle.getWeight();
		}
		return total;
	}
	
	public String getContents() {
		return "Place prises: "+load.size()+" pour un poids de "+totalWeight();
	}

	
}
