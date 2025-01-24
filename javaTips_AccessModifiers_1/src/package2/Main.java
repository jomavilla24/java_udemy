package package2;

// import package1.Animal; This will produce an error as well
import package1.Person; // Import the Class Person from package1

public class Main {
	
	public static void main(String[] args) {
		// Now we can use the class Person (public) anywhere inside the same package 
		// (package1) or anywhere inside any other package (in this example package2)
		// However if we remove the "public" keyword from the Person's class definition
		// we can only use this class inside the same package the class belongs to
		// in this case inside package1
		Person p1 = new Person(100, "Martin");
		System.out.println(p1);
		
		// We can't use Animal class inside package1. The following lines will produce
		// an error
		// Animal a1 = new Animal(100, "Oddie");
		// System.out.println(a1);
	}
}
