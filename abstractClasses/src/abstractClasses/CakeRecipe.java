package abstractClasses;

// This is a class that inherit from the abstract class AbstractRecipe. Notice that
// it is up to this class to define the specifics about the implementation of getIngredients
// prepareDish and cleanUP methods
public class CakeRecipe extends AbstractRecipe {
	public void getIngredients() {
		System.out.println("Get the milk");
		System.out.println("Get the chocolate");
		System.out.println("Get the sugar");
	}
	
	public void prepareDish() {
		System.out.println("Puor the milk");
		System.out.println("Cut the chocolate");
		System.out.println("Put some sugar");
	}
	
	public void cleanUP() {
		System.out.println("Clean everything up please");
	}
}
