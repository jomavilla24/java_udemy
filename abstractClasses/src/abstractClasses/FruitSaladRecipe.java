package abstractClasses;
//This is a class that inherit from the abstract class AbstractRecipe. Notice that
//it is up to this class to define the specifics about the implementation of getIngredients
//prepareDish and cleanUP methods

public class FruitSaladRecipe extends AbstractRecipe {
	public void getIngredients() {
		System.out.println("Get the Fuit");
	}
	
	public void prepareDish() {
		System.out.println("Chop the fruit");
		System.out.println("Put it in a bolw");
	}
	
	public void cleanUP() {
		System.out.println("Clean everything up please");
	}
}
