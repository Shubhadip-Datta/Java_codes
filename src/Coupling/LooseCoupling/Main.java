package Coupling.LooseCoupling;


public class Main {
	
	public static void main(String[] args ) {
		
		Car c1 = new Car(new PetrolEngine());
		Car c2 = new Car(new DieselEngine());
		
		c1.move();
		c2.move();

	}
}
