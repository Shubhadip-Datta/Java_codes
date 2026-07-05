package Inheritance;

public class ExpressTrain extends Train {
	
	public ExpressTrain() {
		super(); // will print -> "This is public train"
		System.out.println("ET - const");
	}
	
	String train_name = "Jaleswar";
	int train_no = 8062;
	
	// Getting the parent data 
	void getParentData() {
		System.out.println(train_name); // Jaleswar
		System.out.println(train_no); // 8062
		System.out.println(super.train_name); // Bhadrak Express
		System.out.println(super.train_no); // 18043	
		
	}
	
	/* this is to check the suggestion of symbol of this IDE*/
	void check() {
		System.out.println("This is for checking");
	}
}
