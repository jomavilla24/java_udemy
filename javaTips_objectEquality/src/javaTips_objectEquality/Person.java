package javaTips_objectEquality;

import java.util.Objects;

public class Person {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	// Automatically generated by Eclipse IDE
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	// Automatically generated by Eclipse IDE. We have changed the name of this method
	public boolean customEquals(Object obj) {
		// Test if both objects are in the same memory location
		if (this == obj)
			return true;
		// Returns false if the argument object is null
		if (obj == null)
			return false;
		// Returns false if the object class names are different
		if (getClass() != obj.getClass())
			return false;
		// Returns true if both objects have the same name field
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}
	
	
}
