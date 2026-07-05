package Assignment;

import java.util.Scanner;

public class student_main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Student registration begins here --->> ");
		System.out.println("Have you decided the course to be enrolled : YES || NO !");
		String response = sc.nextLine();
		
		student s1 = null;
		
		if (response.equalsIgnoreCase("yes")) {
			System.out.print("Enter your Name: ");
			String name = sc.nextLine();
			
			System.out.print("Enter your Course: ");
			String course = sc.nextLine();
			
			s1 = new student(name,20,course);
			s1.printStudent(name,20,course);
		}
		
		else if (response.equalsIgnoreCase("No")) {
			System.out.print("Enter your Name: ");
			String name = sc.nextLine();
			
			s1 = new student(name,20);
			s1.printStudent(name,20);
		}
		else {
			System.out.println("Please Enter a valid data");
		}
		
		student s2 = new student(s1);
		System.out.print("copy of s1: ");
		s2.printStudent();
	}

}
