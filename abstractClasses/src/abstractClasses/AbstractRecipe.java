package abstractClasses;
// This is an abstract class
public abstract class AbstractRecipe {
	// This is a concrete method, because the implementation details of the method,
	// the actual lines of code that make up the method are provided
	public void executeRecipe() {
		// What we are enforcing here is the fact that any class that inherit from
		// this class will have to follow the defined algorithm whenever the execute()
		// method is called: 
		// 1. Get the ingredients
		// 2. Prepare the dish
		// 3. Clean every thing up
		// It is up to the classes that inherit from this abstract class to implement
		// the details of each abstract method
		getIngredients();
		prepareDish();
		cleanUP();
		}
	
	// These methods are abstract methods. because the actual implementation details
	// of these methods are not provided here. It is up to the classes that inherit
	// from this class to provide the implementation details of these methods 
	public abstract void getIngredients();
	public abstract void prepareDish();
	public abstract void cleanUP();
}
