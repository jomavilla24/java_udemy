/* ============================ Final Methods =======================
 * If a method is created with the final keyword, any subclass of this
 * class won't be able to overwrite that method
 * */
package JavaTips_Final_1;

public class Person {
	private Integer age;
	private String name;
	
	// Constructor
	public Person(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	// Final Method. This method can't be overwritten by any subclass
	final public void sayHello() {
		System.out.println("Hello my name is " + age + ". Im " + age + " years old");
	}

	// Getters and Setters
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
