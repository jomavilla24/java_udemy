/*
 * You can also restrict which type of data a generic represent. In the following example
 * the generic <T> extends the class Number. In java the Number class is a super class of
 * integers, double and float numbers. By doing this we are creating a custom class that 
 * will only accepts Numbers
 * */
package generics;

import java.util.ArrayList;

public class MyCustomClass2 <T extends Number> {
	ArrayList<T> list = new ArrayList<>();
	
	public T getElement(int index) {
		return list.get(index);
	}
	
	public void addElement(T element) {
		list.add(element);
	}
	
	public String toString() {
		String str = "";
		
		for(T element:list) {
			str += element.toString() + "|";
		}
		return str;
	}
	 
}
