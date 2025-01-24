package abstractClasses_interfaces;

public class Main {
	public static void main(String[] args) {
		// Notice that Interfaces provide a good way to group different classes together.
		// In the following line we are creating an Array of "Walking Animals", so the
		// array contain a combination of dogs and birds, even though they are from 
		// different classes
		Walking[] walkingAnimals = {new Dog(), new Bird()};
		
		// Now we can use the same method startWalking() to make all this walking animals
		// walk. This is an example of Polymorphism
		// In object-oriented programming, polymorphism is the provision of a single 
		// interface (method) to entities of different types. In this example that 
		// method is startWalking() and the different types are Dog and Bird
		System.out.println("=== DOG ===");
		walkingAnimals[0].startWalking();
		
		System.out.println("=== BIRD ===");
		walkingAnimals[1].startWalking();
	}
}
