package package1;

public class Main {
	
	public static void main(String[] args) {
		// Now we can use the class Person (public) anywhere inside the same package 
		// (package1) or anywhere inside any other package (in this example package2)
		// However if we remove the "public" keyword from the Person's class definition
		// we can only use this class inside the same package the class belongs to
		// in this case inside package1
		Person p1 = new Person(100, "Martin");
		System.out.println(p1);
		
		// We can use Animal class inside package1
		Animal a1 = new Animal(100, "Oddie");
		System.out.println(a1);
	}
}
