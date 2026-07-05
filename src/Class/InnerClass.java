package Class;

class A { // can't make outer class static
	
	int age;
	
	public void show() {
		
		System.out.println("In show method");
	}
	
	class B { // can make inner class static -> static inner class = static nested class
		
		public void config() {
			
			System.out.println("In config method");
		}
	}
}


public class InnerClass {

	public static void main(String[] args) {
		
		A obj = new A();
		obj.show();
		
		// B obj = new B(); -> will show an error bcuz java(javac) does not know B
		
		/* B belongs to class A so to access B write - A.B */
		A.B obj1 = obj.new B();
		obj1.config();
		
		// if the inner class(B) is static we don't need obj of A to create obj of B
		// A.B obj1 = new A.B();

	}

}
