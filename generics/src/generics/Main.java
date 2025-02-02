/*======================== Generic <T> =============================
 * */
package generics;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Create 2 objects of the custom class we have created. 
		MyCustomClass1<String> list1 = new MyCustomClass1<>();
		MyCustomClass1<Integer> list2 = new MyCustomClass1<>();
		
		// Now we can call the custom methods
		list1.addElement("Hello");
		list1.addElement("World");
		list1.addElement("Again");
		
		list2.addElement(10);
		list2.addElement(20);
		list2.addElement(30);
		
		System.out.println(list1.toString()); // Hello|World|Again|
		System.out.println(list2.toString()); // 10|20|30|
		
		// Create 2 objects of the second custom class we have created
		MyCustomClass2<Integer> numbers1 = new MyCustomClass2<>();
		MyCustomClass2<Float> numbers2 = new MyCustomClass2<>();
		
		// The following line will cause a compilation error because we have restricted that
		// CustomClass2 will only take Numbers as arguments.
		// MyCustomClass2<String> words = new MyCustomClass2<>();
		
		// Now we can call the custom methods
		numbers1.addElement(100);
		numbers1.addElement(200);
		numbers1.addElement(300);
		
		numbers2.addElement(10.1f);
		numbers2.addElement(20.2f);
		numbers2.addElement(30.3f);
		
		System.out.println(numbers1.toString()); // 100|200|300|
		System.out.println(numbers2.toString()); // 10.1|20.2|30.3|
	}
	
	// You can also use generic in methods. The following method define a generic T. That method
	// represent any data type that implements the List interface. The method return void 
	// type and also accept data type T it as input
	static <T extends List<T>> void duplicateList(T list) {
		list.addAll(list);
	}
	
	// You can also use Generic wildcard. The following example shows method call addLists()
	// The method return void and takes as argument a List of any object that extends the class
	// Numbers (any subclass of Number). 
	static void showList(List<? extends Number> list) {
		for(Number element:list) {
			System.out.println(element);
		}
	}

}
