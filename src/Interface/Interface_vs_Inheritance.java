package Interface;

// inheritance
class Vehicle {

    void start() {
        System.out.println("Vehicle starts");
    }
}
class Car extends Vehicle {
}

// interface
interface Vehicle1 {
    void start();
}
class Car1 implements Vehicle1 {

    public void start() {
        System.out.println("Car starts");
    }
}

public class Interface_vs_Inheritance {

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		
		Car1 c1 = new Car1();
		c1.start();

	}

}
