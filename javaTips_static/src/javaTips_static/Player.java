package javaTips_static;

public class Player {
	// Instance variables
	private String name;
	private Integer id;
	
	// Class variable (static): shared among all instances of this class. If 
	// this wouldn't be a static variable, this variable would be initialized
	// to zero each time a new object of this class is instantiated. To be able
	// to track the number of players in total we must create this variable as
	// an static one.
	private static Integer numberOfPlayers = 0;

	// Constructor method
	public Player(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
		// Increments the player count each time a new player is created
		numberOfPlayers ++;
	}
	
	// Getters and Setters of instance variables
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	// Class method (Static): Shared among all instances (objects) of this
	// class
	public static Integer getPlayerCount() {
		// Note: Inside static methods you can´t access instance variable
		// (non-static) variables or methods. The next line would cause an error:
		// name = "Other name";
		return numberOfPlayers;
	}
	
	public void showInfo() {
		// Inside non-static method you can access both static and non-static
		// variables or methods
		System.out.println("- Player Name: " + name);
		System.out.println("- Player ID: " + id);
		System.out.println("- Total number of players: " + numberOfPlayers);
	}
}
