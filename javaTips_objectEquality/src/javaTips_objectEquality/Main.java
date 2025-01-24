package javaTips_objectEquality;

public class Main {

	public static void main(String[] args) {
		/* By default 2 variables holding objects are equal if both variable
		 * refer to the same object, that is, the object held in variable 1 is
		 * in the same memory location as the object that is held in variable 2.
		 * 
		 * In the lines below we are creating 2 objects in different memory 
		 * locations, in other words both objects are considered different even
		 * though the hold the same value (name)
		 * */
		
		Person p1 = new Person("Martin");
		Person p2 = new Person("Martin");
		
		Person x = p1;
		
		// The equals() method is a default method inherit by all classes from the
		// object class
		System.out.println(p1.equals(p2)); // False
		System.out.println(p1.equals(p1)); // True
		System.out.println(p1.equals(x)); // True
		
		System.out.println("--- Custom Equality test ----");
		System.out.println(p1.customEquals(p2)); // True
		System.out.println(p1.customEquals(p1)); // True
		System.out.println(p1.customEquals(x)); // True
	}

}
