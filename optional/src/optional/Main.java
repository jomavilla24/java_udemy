/* ============================ Optional ==============================
 * A container object which may or may not contain a non-null value. 
 * If a value is present, isPresent() will return true and get() 
 * will return the value.
 * 
 * This class was introduced in JAVA to avoid Null pointer exceptions, usually
 * this type of error happened when working with List<T> after process
 * such lists the result could be a value or a null.
 * 
 * */
package optional;

import java.util.List;
import java.util.Optional;

public class Main {
	public static void main(String[] args) {
		// This list does contain even numbers
		List<Integer> numbers1 = List.of(1,2,3,4,5,6,7);
		// This list does NOT contain even numbers
		List<Integer> numbers2 = List.of(1,3,5,7);
		
		Optional<Integer> myOptional1 = addAllEvens(numbers1);
		Optional<Integer> myOptional2 = addAllEvens(numbers2);
		
		System.out.println(myOptional1.isPresent()); // True
		System.out.println(myOptional1.get());
		
		System.out.println(myOptional2.isPresent()); // False
		// This will produce < NoSuchElementException exception
		// System.out.println(myOptional2.get());
		// The orElse(n) will return the value of n if the optional
		// contains the null
		System.out.println(myOptional2.orElse(0)); // 0 

	}
/* This is an example of a method that could return an object of class 
 * Optional<T>. This method accept a list as argument and return the
 * value of the maximum even element in the list. However if we pass
 * a list that doesn't have even elements the method will return a 
 * null value
 * */
	public static Optional<Integer> addAllEvens(List<Integer> list) {
		return list.stream().
				filter(e -> e%2 == 0).
				max((e1, e2) -> Integer.compare(e1, e2));
	}
}
