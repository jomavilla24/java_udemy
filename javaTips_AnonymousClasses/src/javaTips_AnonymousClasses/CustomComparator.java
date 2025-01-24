package javaTips_AnonymousClasses;

import java.util.Comparator;

// This is an example of a custom comparator to sort a collection
// of numbers in descending order.
public class CustomComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer n1, Integer n2) {
		// Sort numbers in descending order
		return Integer.compare(n2, n1);
	}

}
