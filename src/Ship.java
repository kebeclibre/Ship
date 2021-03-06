import java.util.ArrayList;

public class Ship extends Vehicle {
	private static int MAX_SPACE=100;
	private static int MAX_WEIGHT=95000;
	private ArrayList<Vehicle> load = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle vehicle) {
		if (findSpot(vehicle)) {load.add(vehicle); }
		else {System.err.println("error pas assez de place");};
	}
	
	private boolean findSpot(Vehicle vehicle) {
		if (totalSpotsTaken()+vehicle.getSpace() <= MAX_SPACE) {	
			if (totalWeight()+vehicle.getWeight() <= MAX_WEIGHT) {
				return true;
			}else{ return false; }
		}else{return false; }
	}

	public void removeLastVehicle() {
		load.remove(load.size()-1);
		}
	
	public int totalWeight() {
		int total=0;
		for (Vehicle vehicle : load) {
			total += vehicle.getWeight();
		}
		return total;
	}
	
	public int totalSpotsTaken() {
		int total = 0;
		for (Vehicle vehicle : load) {
			total += vehicle.getSpace();
		}
		return total;
	}
	
	public String getContents() {
		return "Place prises: "+totalSpotsTaken()+" pour un poids de "+totalWeight();
	}

	
}
