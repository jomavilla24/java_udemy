/* we can implement a custom class that implements
 * the Predicate interface. Inside that class we implement the test()
 * method that returns true if a Integer is even and false otherwise.
 * */
package functionalProgramming_2;

import java.util.function.Predicate;

public class CustomPredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer number) {
		// Return true is number is even and false otherwise 
		return (number%2 == 0);
	}

}
