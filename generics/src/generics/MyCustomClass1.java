/*
 * This is a good example on how to use generic in JAVA. I this example we
 * use generic <T> to create a custom data type that can accept different
 * data types represented by the generic <T>. As you can see in this example
 * it is usually use the letter T to represent a generic,  you can use any
 * variable you want 
 * */
package generics;

import java.util.ArrayList;

public class MyCustomClass1<T> {
	ArrayList<T> list = new ArrayList<>();
	
	public void addElement(T element) {
		list.add(element);
	}
	
	public T getElement(int index) {
		return list.get(index);
	}
	
	public String toString() {
		String str = "";
		
		for(T element:list) {
			str += element.toString() + "|";
		}
		return str;
	}
	
}
