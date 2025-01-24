package package1;

public class Student extends Person {

	public static void main(String[] args) {
		// INSIDE A SUBCLASS INSIDE THE SAME PACKAGE
		Person p1 = new Person();
		p1.publicMethod_Person();
		// p1.privateMethod_Person(); // this will cause a compilation error
		p1.protectedMethod_Person();
		p1.defaultMethod_Person();


	}

}
