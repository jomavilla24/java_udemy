/* ======================== Anonymous Classes ===================================
 * Anonymous Classes are classes that do not have a class name.
 * */
package javaTips_AnonymousClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// We create 2 Array list that contain the same elements
		ArrayList<Integer> numbers1 = new ArrayList<>(List.of(1,2,3,4,5));
		ArrayList<Integer> numbers2 = new ArrayList<>(List.of(1,2,3,4,5));
		ArrayList<Integer> numbers3 = new ArrayList<>(List.of(1,2,3,4,5));
		
		
		// Now, we can sort the array list using a instance of the custom comparator
		// class we created
		Collections.sort(numbers1, new CustomComparator());
		System.out.println(numbers1);
		
		// We can sort the other array list using an Anonymous Class like this:
		Collections.sort(numbers2, new Comparator<Integer>() {
			@Override
			public int compare(Integer n1, Integer n2) {
				// Order the numbers in descending order
				return Integer.compare(n2, n1);
			}
			
		});
		System.out.println(numbers2);
		
		// You can also create new instances of an Anonymous Class like this
		Comparator<Integer> myComparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer n1, Integer n2) {
				// Order the numbers in descending order
				return Integer.compare(n2, n1);
			}
			
		}; // NOTICE THE ; HERE! it is needed to close the statement
		// Now we can use it to sort a list
		Collections.sort(numbers3, myComparator);
		System.out.println(numbers3);
	}

}
