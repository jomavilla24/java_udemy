package package2;

import package1.Person;

public class Client extends Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c1 = new Client();
		
		c1.publicMethod_Person();
		// c1.privateMethod_Person();
		c1.protectedMethod_Person();
		// c1.defaultMethod_Person();

	}

}
