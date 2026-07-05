package Class;

class A1 {
	
	public void show() {
		System.out.println("In A show method");
	}
}

class B1 extends A1 {
	
	public void show() {
		System.out.println("In B show method");
	}
}


public class anonymousInnerClass {

	public static void main(String[] args) {
		
		A1 obj = new A1()
		// anonymous class with no name 
		{
			public void show() {
				System.out.println("In A new show method");
			}
		};
		
		obj.show();

	}

}
