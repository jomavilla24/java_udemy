/* ======================== Final Variables and Arguments ======================
 * Final variables and arguments are those that used the keyword in its declaration
 * A final variable is one that can be assigned a value just once in your program.
 * A final argument is one that can't be assigned inside the method definition
 * 
 * Usually all your variables and arguments should be final. We should avoid 
 * changing the value of variables as much as possible (mutability should be 
 * avoided) because that leads to programs that are more easy to read and understand
 * 
 * */
package javaTips_Final_2;

// Note: You can only have one Public class in a file.
class DummyClass {
	public void dummyMethod(final int arg) {
		// The following line will cause an error because we are trying to assign a 
		// value to a final argument
		// arg = 10;
	}
}

public class Main {

	public static void main(String[] args) {
		// These are final variables. You can assign a value to these variables
		// just once
		final int x = 10;
		final int y;
		y = 11;
		
		// These lines of code will produce a compilation error because we are 
		// trying to assign values to final variables more than once in our 
		// program
		// x = 20;
		// y = 21;
		

	}

}
