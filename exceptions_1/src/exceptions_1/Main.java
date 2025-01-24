/*============================== EXCEPTIONS 1 ==============================
 * There are some things that you need to know about exceptions in JAVA
 * 1. If a program finds a line that throws an exception, an that exception is
 * not handled, the program will stop a the rest of the code won be executed
 * 
 * 2. Exceptions "bubble up the stack", what that means is the following: Let's
 * assume we have the main method calling method_2() and method_2() calls 
 * method_1() and method_1() throws and exception that it is not handled,
 * method_1() will return the exception to method_2() which in turn will return
 * the exception to main. If main does not handle the error no other line of code
 * will be executed.
 * */
package exceptions_1;

public class Main {

	public static void main(String[] args) {
		// TThe main merhod will invoke method_2() which in turn invokes method_1()
		// method_1() will throw an exception and that exception will bubble up from
		// method_1 to method_2 all the way to main
		// The error message will look like this
		
		/*
		 * 	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
			at exceptions_1/exceptions_1.Main.method_1(Main.java:41)
			at exceptions_1/exceptions_1.Main.method_2(Main.java:34)
			at exceptions_1/exceptions_1.Main.main(Main.java:29)		 
			* */
		method_2();
	}
	
	// Method_2() will invoke method_1() which in turn will throw an 
	public static void method_2 () {
		method_1();
		return;
	}
	
	public static void method_1 () {
		// This method is will throw an ArrayIndexOutOfBoundsException
		int[] array = {0, 1, 2};
		array[5] = 4; // ERROR!... will throw ArrayIndexOutOfBoundsException
		return;
	}

}
