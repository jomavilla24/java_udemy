package shapes;

public class Triangle extends GeometricShape {
	
	private float high;
	private float base;
	
	// Class constructor method
	public Triangle(float high, float base) {
		this.high = high;
		this.base = base;
	}
	
	// Method to calculate the area of a triangle
	public float getTriangleArea() {
		return 0.5f * high * base;
	}
	
	// Method to return the shape name
	public String getShapeName() {
		return "triangle";
	}
}
