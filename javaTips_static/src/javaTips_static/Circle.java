package javaTips_static;

public class Circle {
	// Regular instance variable
	private Float radius;
	
	// Public - Static - Variable is the equivalent of a constant that can 
	// be used anywhere
	// Static means that this variable is shared among all instances of this
	// class.
	// Final means that the value of this variable can't be change
	// Public means that this value can be used everywhere Circle.PI
	public static final Float PI = 3.1416f;

	// Constructor
	public Circle(Float radius) {
		super();
		this.radius = radius;
	}
	
	// Getter and Setters
	public Float getRadius() {
		return radius;
	}

	public void setRadius(Float radius) {
		this.radius = radius;
	}

	// Calculate perimeter and area of the circle
	public Float getArea() {
		return PI * radius * radius;
	}
	
	public Float getPerimeter() {
		return 2*PI*radius;
	}

}
