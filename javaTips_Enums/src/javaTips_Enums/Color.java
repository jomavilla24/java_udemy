package javaTips_Enums;

public enum Color {
	
// Ordinal
//  0			1			2			3
	RED(10), ORANGE(20), GREEN(30), YELLOW(40);

	private int value;
	
	// Constructor
	Color(int value) {
		this.value = value;
	}

	// Getters and Setters
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}	
}
