package abstractClasses_interfaces;
// This is a good example of an abstract class. In this video game example
// there can only be 4 types of animals: dogs, cats, birds and fish. You'll never
// create an object of class Animal because any Animal will be either dog, cat 
// bird or fish, it wouldn't make any sense to create on object of class Animal.
// Because of this, Animal is a good candidate to be an Abstract class because
// we will never instantiate an object of this class. The Abstract class
// Animal will have 3 abstract methods: born(), reproduce() and die(). All
// subclasses of this superclass will have to provide implementation details
// of those methods

public abstract class Animal {
	// Abstract methods. The implementation details must be provided by subclasses
	public abstract void born();
	public abstract void reproduce();
	public abstract void die();
}
