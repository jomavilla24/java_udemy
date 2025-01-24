package package1;

// (Default) access modifier. 
// If we tryto use this class outside of package1 we'll get an error
class Animal {
	private Integer id;
	private String name;
	
	// Constructor
	public Animal(Integer id, String name) {
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
