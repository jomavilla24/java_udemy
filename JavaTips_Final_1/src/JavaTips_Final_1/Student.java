package JavaTips_Final_1;

public class Student extends Person {

	// Constructor
	public Student(Integer age, String name) {
		super(age, name);
		// TODO Auto-generated constructor stub
	}
	
	// The following line will cause a compilation error. This is because
	// the sayHello() method is a "final" method and no subclass will
	// be able to overwrite it
	// final public void sayHello() {
	//	System.out.println("Hello, I'm a Student");
	//}

}
