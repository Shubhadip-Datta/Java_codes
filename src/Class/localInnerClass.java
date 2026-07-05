package Class;

class Outer {
	
	// inner class inside a method -> usable only within that method.
    void display() {
    	
        int x = 10; // local variables must be: final or effectively final
        class Inner {
            void show() {
                System.out.println(x);
            }
        }

        Inner obj = new Inner();
        obj.show();
        
        // x = 20; -> ERROR
    }
}

public class localInnerClass {
	
	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.display();
	}

}
