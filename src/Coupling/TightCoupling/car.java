package Coupling.TightCoupling;

public class car { // car is dependent to a type of engine
	
	PetrolEngine e; // tightly coupled
	car() {
		e = new PetrolEngine();
	}
	
	void move() {
		System.out.println("Car moves with: ");
		e.show();
	}
}
