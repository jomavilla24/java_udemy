package javaTips_nestedClasses;

// This is a default class, please remember that if no access modifiers
// are given the default access modifier is assumed. This class will be
// accessible inside this package
class DefaultClass {
	
}

// In this case Main is the outer class. Inside this class we can have 2 
// types of nested classes:
// 1. Nested Class (also known as Inner class)
// 2. Static Nested Class (also known as Static Inner class)
public class Main {
	
	Integer outerVar;
	
	class NestedClass {
		// Inside a nested class we can access variables of the outer class
		// this is because any object of a nested class will need an object
		// of an outer class to exist first
		public void method() {
			outerVar = 5;
		}
 	}
	
	static class StaticNestedClass {
		// However we can't access  variables of the outer class inside static
		// nested class. This is because an object of the static nested class can
		// exist with out an object of the outer class created 
		public void method() {
			// outerVar = 5;
		}
	}
	
	// This is a public method of the outer class
	public static void main(String[] args) {
		// It is not possible to create an object of a Nested class. The next
		// line will cause an error
		// NestedClass nc1 = new NestedClass();
		
		// You can create objects from static nested classes with out creating
		// objects of the outer class
		StaticNestedClass snc1 = new StaticNestedClass();
		
		// You can create objects of a nested class only if you create an object
		// of the outer class first
		Main m1 = new Main();
		NestedClass nc1 = m1.new NestedClass();

	}

}
