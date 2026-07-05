package Abstraction;

abstract class Animal {
	
	Animal() {
		System.out.println("Animal makes sound");
	}
	public abstract void sound();
}

class Dog extends Animal {
	
	public Dog() {
		super();
	}
	public void sound() {
		System.out.println("Dog is braking");
	}
}

class Lion extends Animal {
	
//	public Lion() { -> Every constructor in Java (child class) automatically calls the parent constructor (super()) unless you explicitly call another constructor
//		super();
//	}
	public void sound() {
		System.out.println("Lion is roaring");
	}
}

class Test {
	public static void main(String args[]) {
		Dog d = new Dog();
		Lion l = new Lion();
		d.sound();
		l.sound();
	}
}
