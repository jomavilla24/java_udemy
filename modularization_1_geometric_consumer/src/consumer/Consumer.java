/* ============================== Modularization 1 ==============================
 * Lets assume the following statements
 * 
 * 1. In the project folder name modularization_1_geometric_shapes we have created
 * two packages:
 * - shapes:
 *   This package contains the Class files for Circle, Triangle and Square. Each of
 *   these classes has a different method name to calculate its area
 * 
 * - areUtil
 *   This package only contains a class named AreaCalculator that contains a simple
 *   method to calculate the area of any geometric shape just by using the static
 *   method AreaCalculator.getArea(shape), this is a utility.
 *   
 * 2. Our goal is to create a another project in a different folder named
 * modularization_1_geometric_consumer that will be using the utility in areUtil package
 * and the shapes class in the shapes package. Our other goal is to restrict the consumer
 * to only calculate the area of the shapes by using the static method in the AreaCalculator
 * class inside the areUtil package to calculate the area of any shape. The consumer
 * shouln't be able to calculate the area of the shapes by using the methods of the class
 * shapes
 * 
 *  we will try to do it by changing the .classpath file inside the 
 * modularization_1_geometric_consumer project. Right click on modularization_1_geometric_consumer 
 * -> Properties; search the option "Java Build Path" on the left, the on the projects
 * tab select the .classpath file and click on add, select the project modularization_1_geometric_shapes.
 * This will make all packages in modularization_1_geometric_shapes folder available to. Finally erase 
 * the file module-info.java from the modularization_1_geometric_consumer project
 * the consumer folder.
 * 
 * */

package consumer;

// This imports are needed
import shapes.Circle;
import shapes.Square;
import shapes.Triangle;
import areaUtil.AreaCalculator;

public class Consumer {
	public static void main(String[] args) {
		
		// First we must create a couple of geometric shapes
		Circle circle = new Circle(1);
		Triangle triangle = new Triangle(1,2);
		Square square = new Square(2);
		
		// Now we can use the static method to calculate the area
		System.out.println(AreaCalculator.getArea(circle));
		System.out.println(AreaCalculator.getArea(triangle));
		System.out.println(AreaCalculator.getArea(square));
		
		// However since we have allowed this project to access all the content of the
		// project modularization_1_geometric_shapes we can also calculate the area
		// of the shapes by using the methods available in the class Circle, Triangle
		// and Square and we should be able to do this
		System.out.println(circle.getCircleArea());
	}
}
