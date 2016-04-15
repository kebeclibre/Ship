
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ship rainbowWarrior = new Ship();
		
		for (int i=0; i < 80; i++) {
			rainbowWarrior.addVehicle(new Van());
			System.out.println("salve 1: "+rainbowWarrior.getContents());
		}
			rainbowWarrior.addVehicle(new Van());
			System.out.println("salve 1: "+rainbowWarrior.getContents());
	
	
			float nb = 0.2f;
			nb = nb +0.3f;
			System.out.println(nb);
	}
}
