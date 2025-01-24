package package1;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.publicMethod_Person();
		//p1.privateMethod_Person(); // this will cause a compilation error
		p1.protectedMethod_Person(); // this will cause a compilation error
		p1.defaultMethod_Person();
	}

}
