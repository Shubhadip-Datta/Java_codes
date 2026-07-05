package Assignment;

public class student {
	
	static final String institute = "Vinland";
	String name;
	int age;
	String course;
	
	public student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public student(String name, int age, String course) {
		this(name,age);
		this.course = course;
	}
	
	// copy constructor
	public student(student s) {
		this.name = s.name;
		this.age = s.age;
		this.course = s.course;
	}
	
	void printStudent() {
		System.out.println(name + " " + age + " " + course);
	}
	
	void printStudent(String name, int age, String course) {
		System.out.println(name + " " + age + " " + course);
	}
	
	void printStudent(String name, int age) {
		System.out.println(name + " " + age);
		System.out.println("No course selected");
	}
	
	public static void main(String[] args) {
		
	}

}
