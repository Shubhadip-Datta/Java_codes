package Coupling.LooseCoupling;


public class Car {
	
	Engine e; // loosely coupled (Interface)
	Car(Engine obj) {
		e = obj;
	}
	
	void move() {
		System.out.print("Car moves with: ");
		e.show();
	}
}
