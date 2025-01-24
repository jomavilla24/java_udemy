/* ============================= Functional Programming =============================
 * The big difference between object oriented programming and functional programming is
 * that is functional programming functions are treated as "first class citizens", this
 * means that functions are treated as any other regular object, in other words functions
 * can be assigned to variables, we can call methods on functions objects, functions can 
 * be passed as arguments to other functions, etc
 * 
 * a Stream<T> of type T is an interface in JAVA that represents A sequence of elements 
 * supporting sequential and parallel aggregate operations.
 * */
package functionalProgramming_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// create an ArrayList containing numbers
		ArrayList<Integer> numbers = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
		ArrayList<Integer> randomNumbers = new ArrayList<>(List.of(1,300, 0,100, 1, 2, 300));
		// printElements2(numbers);
		// printEvenNumber(numbers);
		// System.out.println(sumAll(numbers));
		// System.out.println(sumEven(numbers));
		// printSorted(randomNumbers);
		// printUnique(randomNumbers);
		// printSquares(numbers);
		// printMax(numbers);
		// printMin(numbers);
		System.out.println(evenList(numbers));
	}
	
	// We can create a method that loops through the elements of an ArrayList
	// and print them to the screen using regular OOP approach. Note in this
	// case we are using a regular for loop to loop through the list and printing
	// the elements to the screen
	public static void printElements(List<Integer> list) {
		for(Integer element:list) {
			System.out.println(element);
		}
	}
	
	/* We can use a functional programming approach to the same problem. In this case
	 * the method we have created convert any list to a stream. Then we use the forEach()
	 * method to loop through the List. For each iteration the forEach() method will
	 * pass the next element of the list and a function will be executed on that element.
	 * The -> operator is called lambda. A lambda expression is a shorter form of 
	 * expressing methods
	 * * */
	public static void printElements2(List<Integer> list) {
		list.stream().forEach(element -> System.out.println(element));
	}
	
	/* We can use the filter() method to create a sub-stream that only contains elements that
	 * satisfy a logical condition. This logical condition is expressed as a lambda function
	 * that returns a true or false depending on whether the logical condition is met or not.
	 * The filter() method will take each element of the collection and applies the function we
	 * have passed to each element of the collection, if the function returns true the filter()
	 * method will return that element as part of a sub-stream. Since the filter() method
	 * returns a stream, we can chain in it with the forEach() method to print the resulting
	 * sub-stream to the screen
	 * */
	public static void printEvenNumber(List<Integer> list) {
		list.stream().
			filter(e -> e%2 == 0).
			forEach(e -> System.out.println(e));
	}
	
	/* The reduce() method allows you to "reduce" any collection to just one value. This method
	 * takes 2 arguments:
	 * reduce(initialValue, function(e[n], e[n+1])
	 * Where:
	 * initialValue: Its the initial value to start the iteration with
	 * function(e[n], e[n+1]) is a function to reduce the collection, e[n], e[n+1] are elements
	 * of the collection at indexes n and n+1
	 * What the reduce() method does is an iteration from n = 0 to n = l - 1
	 * where l = collection.length() - 1
	 * following this logic:
	 * n = 0 =====> result = function(initialValue, e[0])
	 * n = 1 =====> result = function(result, e[1])
	 * n = 2 =====> result = function(result, e[2])
	 * .
	 * .
	 * .
	 * n = l-2 ===> result = function(result, e[l-2])
	 * n = l-1 ===> result = function(result, e[l-1]) // last element of the collection
	 * return result
	 * */
	public static int sumAll(List<Integer> list) {
		return list.stream().reduce(0, (e1, e2) -> e1 + e2);
	}
	
	public static int sumEven(List<Integer> list) {
		return list.stream().filter(e -> e%2 == 0).reduce(0, (e1,e2) -> e1+e2);
	}
	
	/* The sorted() method returns a new stream with the elements of that stream sorted in
	 * ascending order
	 * */
	public static void printSorted(List<Integer> list) {
		list.stream().sorted().forEach(e -> System.out.println(e));
	}
	
	/* The distinct() method returns a new stream with un-duplicated elements of the original
	 * stream
	 * */
	public static void printUnique(List<Integer> list) {
		list.stream().distinct().forEach(e -> System.out.println(e));
	}
	
	/* The map(e-> function(e)) method returns a new ReferencePipeline where each element is the result
	 * of applying a function to that element. ReferencePipeline implements the Stream<T> interface
	 * */
	public static void printSquares(List<Integer> list) {
		list.stream().map(e -> e*e).forEach(e -> System.out.println(e));
	}
	
	/* The max(comparator_func) method returns the maximum value inside a stream. This method takes
	 * a comparator function as argument. The max() method return a object of Optional<T>
	 * class. The Optional<T> class is a class that meant to represent either a null or 
	 * any other value. This is because of we feed a empty list to the max() method this
	 * should return a null value, but if we feed a non-empyt value to the max() method
	 * the maximum value should be returned. The get() method is a method of the class Optional<T>
	 * that allows us the get the value of the Optional<T> object
	 * */
	public static void printMax(List<Integer> list) {
		int max = list.stream().max((n1, n2) -> Integer.compare(n1, n2)).get();
		System.out.println(max);
	}
	
	/* The min(comparator_func) is exactly the same as the max() method except this method
	 * returns the minimum element in a stream.
	 * */
	public static void printMin(List<Integer> list) {
		int min = list.stream().min((n1, n2) -> Integer.compare(n1, n2)).get();
		System.out.println(min);
	}
	
	/* The collect(Collectors.toList()) converts a stream to a list. The following method filter
	 * only the even numbers from the initial list a returns a new list with only those
	 * even numbers
	 * */
	public static List<Integer> evenList(List<Integer> list) {
		return list.stream().filter(e -> e%2 == 0).collect(Collectors.toList());
	}
	
	/* With streams we have 2 types of methods or operations:
	 * - Intermediate method or operations: Those are stream methods that return another stream.
	 * Examples are filter()
	 * - Terminal method or operation: those are methods that do not return a stream back. Examples
	 * are reduce() and forEach(). They usually return a single value back (not a stream)
	 * */
}
