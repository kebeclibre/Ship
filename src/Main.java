
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ship rainbowWarrior = new Ship();
		
		for (int i=0; i < 80; i++) {
			rainbowWarrior.addVehicle(new Car());
			System.err.println("salve 1: "+rainbowWarrior.getContents());
			rainbowWarrior.addVehicle(new Velo());
			System.err.println("salve 2: "+rainbowWarrior.getContents());
		}
			rainbowWarrior.addVehicle(new Van());
	}

}