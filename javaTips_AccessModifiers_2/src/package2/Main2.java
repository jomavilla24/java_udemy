package package2;

import package1.Person;

public class Main2 {

	public static void main(String[] args) {
		// OUTSIDE THE CLASS OUTSIDE THE PACKAGE
		Person p1 = new Person();
		p1.publicMethod_Person();
		// p1.privateMethod_Person(); // this will cause a compilation error
		// p1.protectedMethod_Person(); // this will cause a compilation error
		// p1.defaultMethod_Person(); // this will cause a compilation error

	}

}
