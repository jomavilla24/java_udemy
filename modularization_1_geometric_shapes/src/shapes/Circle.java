package shapes;

public class Circle extends GeometricShape {
	private float radius;
	private final static float PI = 3.1416f;
	
	// Class Constructor Method
	public Circle(float radius) {
		super();
		this.radius = radius;
	}
	
	// Method to calculate area of the circle
	public float getCircleArea() {
		return PI * radius * radius;
	}
	
	// Method to return the shape name
	public String getShapeName() {
		return "circle";
	}
	
}
