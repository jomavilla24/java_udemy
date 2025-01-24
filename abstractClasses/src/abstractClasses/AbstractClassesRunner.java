/*
 * ==================================== Abstract Classes ========================================
 * Abstract classes are Java classes that have abstract methods.
 * Abstract methods are those methods inside a class that do not have details implementations. 
 * This means that abstract method are method that are only declared (similar to C prototypes)
 * but the actual code of the method is not written in the abstract class. It is left to the 
 * classes that inherit from this class to provide the code of those methods.
 * 
 * Abstract classes are useful when you want to define a class that implement base algorithm or
 * steps to produce a result but it the details on how to execute each step is left to the 
 * classes that inherit from the abstract class. Note that no abstract classes that inherit from
 * abstract classes are called concrete classes
 * 
 * An important thing to note is that you can't instantiate objects from a abstract class.
 * 
 * In this example we have an abstract class named GenericRecipe that implements the base algorithm
 * for preparing any type of recipe. The base algorithm is as follows:
 * 1. Get the ingredients
 * 2. Prepare the dish
 * 3. Clean every thing up
 * */

package abstractClasses;

public class AbstractClassesRunner {

	public static void main(String[] args) {

		CakeRecipe cakeRecipe1 = new CakeRecipe();
		cakeRecipe1.executeRecipe();
		
		System.out.println("==============");
		
		FruitSaladRecipe fruitSalad1 = new FruitSaladRecipe();
		fruitSalad1.executeRecipe();
	}

}
