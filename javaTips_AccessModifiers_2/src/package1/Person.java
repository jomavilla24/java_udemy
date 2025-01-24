package package1;

public class Person {
	
	public void publicMethod_Person() {
		System.out.println("Im a public method of Person");
	}
	
	private void privateMethod_Person() {
		System.out.println("Im a private method of Person");
	}
	
	protected void protectedMethod_Person() {
		System.out.println("Im a protected method of Person");
	}
	
	void defaultMethod_Person() {
		System.out.println("Im a default method of person");
	}

	// Accessing methods inside the same class
	public static void main(String[] args) {
		// Notice that we can access all methods inside the same class
		Person p1 = new Person();
		p1.publicMethod_Person();
		p1.privateMethod_Person();
		p1.protectedMethod_Person();
		p1.defaultMethod_Person();
	}

}
