/* ============================ Class Access Modifiers =============================
 * In general we have 4 access modifiers
 * 1. Public
 * 2. Private
 * 3. Protected
 * 4. (Default) This is the absence of any keyword
 * 
 * However in classes we only have 2 access modifier Public and (default).
 * 
 * For classes the public access modifier means that the class can be used inside the
 * same package the class lives in or outside that package. However if we remove if
 * remove the public keyword from the class definition, in other words we use the 
 * (default) access modifiers, this class could only be used inside package1 which is
 * the package this class was defined on.
 * */
package package1;

public class Person {
	private Integer id;
	private String name;
	
	// Constructor
	public Person(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	// Setters and Getters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
