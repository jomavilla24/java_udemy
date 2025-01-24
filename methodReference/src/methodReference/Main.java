/* ================================== Method References ==============================
 * Method references are way to improve the readability of your code. It is shortcut 
 * to invoke Class methods. The general syntax is as follows:
 * Class_Name::method_name
 * */
package methodReference;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Number list
		List<Integer> numbers = List.of(0,1,2,3,4,5,6,7,8,9);
		List<String> strList = List.of("martin", "villanueva", "mauricio");
		
		// The following line print all elements of the list to the screen. Notice the 
		// method reference System.out::println, in this case System.out is the name of 
		// class and println() is the name of the method. Also notice that System.out::println
		// is exactly as (e) -> System.out.println(e). Notice in this case println is a static
		// method, in other words it is a method that does not belong to any instance of class
		// System,.out, it belongs to the class. Method references can also work with instance
		// methods
		numbers.stream().forEach(System.out::println);
		
		// The following line print the length of each string on the list 
		strList.stream().map(String::length).forEach(System.out::println);
		
		// You can also have custom methods. The following line of code return the sum of 
		// all elements in the list of numbers
		int x = numbers.stream().reduce(0, CustomClass::adition);
		System.out.println(x);

	}

}
