package Casting;

public class CastingMain {
	
	/* we need do it static-> Static(main) methods cannot directly call non-static methods */
	public static void doAnimalStuff(Animal myanimal) {
		
		myanimal.makeNoise();
		
		if(myanimal instanceof Dog) {
			/* syntax
			 * ChildClass obj = (ChildClass)parentReference;
			 */
			Dog myDog = (Dog)myanimal; // down casting
			myDog.growl();
		}
	}
	
	public static void main(String[] args) {
		
		/* Animal myAnimal = (Animal)new Dog(); -> same */ 
		Animal myAnimal = new Cat(); // up casting
		
		myAnimal.makeNoise();
		// myAnimal.growl(); -> gives a error 
		
		doAnimalStuff(myAnimal);
	}
	
	
}
