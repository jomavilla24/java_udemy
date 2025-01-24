package shapes;

public class Square extends GeometricShape {
	
	private float side;
	
	// Square constructor method
	public Square(float side) {
		this.side = side;
	}
	
	// Method to calculate the square area
	public float getSquareArea() {
		return side * side;
	}
	
	// Method to return the shape name
	public String getShapeName() {
		return "square";
	}
}
