/* ========================= Navigable Map and TreeMap ========================
 * The class TreeMap is the only class of the ones we've seen so far that implements
 * the Navigable Map interface. Because of this TreeMaps offer additional methods
 * not present in the other Maps seen so far.
 * */

package TreeMap_NavigableMap;

import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// Creates a new tree map
		TreeMap<String, Integer> myTree = new TreeMap<>(Map.of(
				"a", 10, "b", 20, "c", 30));
		
		// The higherKey(k) method returns the key that is greater than k. If no key greater
		// than k exist in the tree null is returned
		System.out.println(myTree.higherKey("a")); // b
		System.out.println(myTree.higherKey("c")); // null
		
		// The ceiling(k) method returns the key that is greater or equal to k. If no key greater
		// or equal to k exist in the tree null is returned
		System.out.println(myTree.ceilingKey("a")); // a
		System.out.println(myTree.ceilingKey("c")); // c
		
		// The lowerKey(k) method returns the key that is less than k. If no key less
		// than k exist in the tree null is returned
		System.out.println(myTree.lowerKey("b")); // a
		System.out.println(myTree.lowerKey("a")); // null

		// The floor(k) method returns the key that is greater or equal to k. If no key greater
		// or equal to k exist in the tree null is returned
		System.out.println(myTree.floorKey("b")); // b
		System.out.println(myTree.floorKey("a")); // a
		
		// The firstKey() and lastKey() method return the first and last key in a tree Map
		// Remember that Tree Maps are sorted by default
		System.out.println(myTree.firstKey()); // a
		System.out.println(myTree.lastKey()); // c
		
		// The firstEntry() and lastEntry() method return the first and last entries in a tree Map
		// Remember that Tree Maps are sorted by default
		System.out.println(myTree.firstEntry()); // a=10
		System.out.println(myTree.lastEntry()); // c=30
	}

}
