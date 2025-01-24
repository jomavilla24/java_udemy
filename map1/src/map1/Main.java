/* ========================= Map Interface ===================================
 * The following classes implement the Map interface, so all of them share the same
 * methods
 * 
 * HashMap    		unsorted - unordered (insertion order is not maintain)
 * HashTable  		unsorted - unordered (insertion order is maintain)  - Threat safe version of HashMap(Synchronized)
 * LinkedHashMap	unsorted - insertion order is maintain
 * TreeMap			Sorted - unordered
 * 
 * 
 * */

package map1;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// The following line creates a in-mutable Map '{"a"=10, "b"=20, "c"=30 }
		Map<String, Integer> unMutableMap = Map.of("a", 10, "b", 20, "c", 30);
		
		// Since this map is un-mutable, the following line will throw an error.
		//unMutableMap.put("z", 15);
		// The put() method allow you to add a new key,value pair to the map. in 
		// which case this method return null, or to refresh the value of an existing
		// key,value pair in which case this method return the old value corresponding
		// to the key
		
		// The get method will return the value corresponding to a particular key.
		// If the key does not exist inside the Map, null will be returned
		System.out.println(unMutableMap.get("a")); // 10
		System.out.println(unMutableMap.get("z")); // null
		
		// The is empty method returns true is the map is empty, otherwise return 
		// false
		System.out.println(unMutableMap.isEmpty()); // false
		
		// The containsKey(k) method returns true if the key k is present inside
		// the map. Otherwise returns false
		System.out.println(unMutableMap.containsKey("a")); // true
		
		// The containsValue(v) method returns true if the value v is present inside
		// the map. Otherwise returns false
		System.out.println(unMutableMap.containsValue(10)); // true
		
		// The keySet() method returns a set containing the values of the keys
		System.out.println(unMutableMap.keySet());  // [c, b, a]
		
		// The values() method returns a collection containing the values 
		System.out.println(unMutableMap.values()); // [20, 30, 10]
		
		// The remove(k) method remove the element with key k from the Map, the 
		// method return the value corresponding to the key that is being removed.
		// If the key k is not found inside the Map, null is returned
		System.out.println(unMutableMap.remove("a")); // 10
		System.out.println(unMutableMap.remove("z")); // null
		
	}

}
