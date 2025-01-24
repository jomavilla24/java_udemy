/* ============================ Java Blocks of code ==========================
 * In java anything surrounded by a pair of braces is considered a block of
 * code. 
 * 
 * Variables are local to the block of code they were declared in, that means
 * that variables can't be used outside of the block of code they were defined
 * */
package javaTips_blocks;

public class Main {

	public static void main(String[] args) {
		int y = 10;
		// This is considered a block of code. All variables declared here
		// can't be used outside of this block of code. however you can use
		// variables that were declared in a block of code above that contains
		// this block of code.
		{
			int x = 0;
			String str = "Hello world";
			System.out.println("Hello from inside the block");
			System.out.println(y);
		}
		
		// These lines of code will be invalid because we are trying to access
		// variables outside of the block of code they were declared in
		// System.out.println(x);
		// System.out.println(str);
		
		// This is considered a block as well because the code is surrounded
		// by braces. Notice that we are using the same variable names as the
		// block above, this is not a problem because they are independent
		// from each other.
		if(true) {
			System.out.println("Hello from the insde of the if block");
			int x = 0;
			String str = "Hello world";
		}

	}

}
