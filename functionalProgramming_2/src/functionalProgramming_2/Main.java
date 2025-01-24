package functionalProgramming_2;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(0,1,2,3,4,5,6,7,8,9);
		
		// This code prints the even numbers on the screen
		numbers.stream()
				.filter(e -> e%2 == 0)
				.forEach(e -> System.out.println(e));
		
		/* This is the signature of the filter method:
		 * public final Stream<P_OUT> filter(Predicate<? super P_OUT> predicate)
		 * 
		 * The filter method takes an object that implements the Predicate<T> interface. 
		 * The Predicate<T> interface demands any class that implements it to provide the 
		 * implementation details of the test() method 
		 * boolean test(T t);
		 * 
		 * Now that we know that, we can implement a custom class that implements
		 * the Predicate interface. Inside that class we implement the test()
		 * method that returns true if a Integer is even and false otherwise.
		 * 
		 * With the custom class we can pass a object of class CustomPredicate an
		 * have exactly the same result as the code above
		 * */
		numbers.stream()
		.filter(new CustomPredicate())
		.forEach(e -> System.out.println(e));
	}

}
