/*============================= COLLECTIONS =================================
 * Why do we need collections?
 * We need collections because after an array has been created it is not possible
 * to change its length. You can't perform actions like pop or push like in other
 * programming languages. For example in python we have lists, with lists you can
 * pop or push elements from the lists
 * 
 * What types of collections exist in java?
 * Lists
 * Sets
 * Queues
 * Maps
 * 
 * LISTS:
 * lists cares about the position of the elements
 * You can add elements at any position in the list, if no position is given while
 * adding it to the list it will be added to the end of the list
 * 
 * */
package collection_list;
import java.util.ArrayList; // This is needed to work with Array lists
import java.util.Iterator;
import java.util.LinkedList; // This is needed to work with Linked lists
import java.util.List; // This is needed to work with lists
import java.util.Vector; // This is needed to work with vectors

public class Main {

	public static void main(String[] args) {
		// Creates an List of strings. However anything created with the of() method will be a
		// in mutable list. 
		List<String> words = List.of("hello", "world", "hello", "again");
		
		// you can check the length of a list with the size method
		System.out.println("Length of the List :" + words.size());
	
		// Check if something is inside the list
		System.out.println("Is cat inside the list: " + words.contains("cat"));
		
		// Get the value of an element using index. This method does not remove the element
		// from the list
		System.out.println("The element at index 0 : " + words.get(0));
		
		// Get the index number of the first occurrence of a value inside a List. This method
		// returns -1 if no occurrence happens
		System.out.println("The word 'again' occurs in index : " + words.indexOf("again"));
		
		// To create mutable lists you can use ArrayLists, LinkedList or Vector
		List<String> wordArrayList = new ArrayList<String>(words);
		List<String> wordLinkedList = new LinkedList<String>(words);
		List<String> wordVector = new Vector<String>(words);
		
		// now you can add elements to those mutable objects
		wordArrayList.add("hi");
		wordLinkedList.add("hi");
		wordVector.add("hi");
		
		// you can loop trough any of these objects
		for (String word:wordLinkedList) {
			System.out.println(word);
		}
		
		/*
		 * Note: The difference of ArrayList and Linked Lists is that Looping through an Array
		 * list is faster than loop through a Linked List. However if we want to add or remove
		 * elements Linked Lists perform that operation faster
		 * 
		 * The difference between ArrayList and Vectors is that Vectors are threat safe, because
		 * they implement synchronized methods. Array Lists are not threat safe. However being
		 * threat safe comes with a performance penalty
		 * */
		
		// you can add elements at any position inside a linked list, array list or vector with 
		// add() method
		wordArrayList.add(2, "cat");
		wordLinkedList.add(2, "dog");
		wordVector.add(2, "fish");
		
		// I can add a list inside other lists at any position
		wordArrayList.addAll(2, words);
		wordLinkedList.addAll(2, words);
		wordVector.addAll(2, words);
		
		// You can change the value of any element at any position with the set() method. Note
		// the following expression won't work wordArrayList[2] = "new", neither their equivalents
		// in linked lists and vectors
		wordArrayList.set(2, "new");
		wordLinkedList.set(2, "new");
		wordVector.set(2, "new");
		
		// the remove() method removes an element from a Array List, Linked list or vector. If you
		// provide the index number as the input the method returns the value of the removed 
		// element. If you provide the value of the element being removed the method returns true
		// if that element is found and false otherwise
		wordArrayList.remove(2);
		
		// You can iterate through an Array List, Vector or linked list using an Iterator
		Iterator<String> wordArrayListIterator = wordArrayList.iterator();
		
		while(wordArrayListIterator.hasNext()) {
			System.out.println(wordArrayListIterator.next());
		}
		
		// Note. If we are integrating thought the List and we want to remove elements or modify
		// the list, the iterator approach is recommended
		
		// Note, You can create a List with different data types, this is not recommended
		List myList = new ArrayList(List.of("hello", 1, 20, 'a'));
		
		// Note that all elements of a list are converted to their respective Wrapper classes (autobox)
		// myList.get(0) instanceof String; // True
		// myList.get(1) instanceof Integer; // True
		// myList.get(3) instanceof Character; // True
		
		// If we want to use the remove() or add() method in a list with integers and we want to find a element
		// we need to do this
		List<Integer> myNumbers = new ArrayList<>(List.of(100, 101, 102, 103));
		myNumbers.remove(Integer.valueOf(103)); // remove element 103
		// the above happens because the remove method accept 2 types of arguments. When we
		// provide an object as an argument the method removes the first occurrence of that object
		// from the array, however when we provide a integer as argument the method assumes we
		// are passing an index. So to remove the element of value 103 we must pass a object, not
		// an integer. That is way we passed Integer.valueOf(103) as argument to the remove method
	}
	

}
