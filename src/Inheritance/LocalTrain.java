package Inheritance;

public class LocalTrain extends Train {
	void ltData() {
		super.service();
		super.utility();
		System.out.println("In case the local fare is low but the service is poorest !");
	}
}
