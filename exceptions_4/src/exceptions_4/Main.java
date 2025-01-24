/* ========== Check and unchecked exceptions and the exception hierarchy ==============
 * In Java Exceptions follow this hierarchy
 * 
 * 						Throwable
 * 							|
 *           _______________|_____________
 *           |                            |
 *         Error						Exception
 * 										  |
 * 				    ______________________|_________________________
 * 					|												|	
 * 		 InterruptedException (Risky - Checked) 			RuntimeException (no Risky - Un-checked)
 * 																	|
 * 															NullPointerException				
 * 
 * Methods in Java we are only obligated to handle everything that is not a RuntimeException. 
 * Runtime Exceptions are known as Unchecked exceptions, any other type of exceptions are known
 * as Checked exceptions
 * If choose not to handle a checked exception in a method we must include the "throws" keyword 
 * in the method definition. If the code inside our method has the possibility of throwing an 
 * unchecked exception we are not obligated to handle it with a try-catch statement nor
 * add the "throw" keyword at the end of the method
 * 
 * Errors are situations that the programmer will not be able to handle, for example JVM is out of
 * memory, or stack overflow.
 * Exceptions are situation that the programmer will be able to handle 
 * * */	
package exceptions_4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// This is a custom method that takes the number of seconds and stop
	// the execution of the tread by the specified number of seconds. Notice
	// the "throws" keyword at the end of the method. This is needed because
	// in some occasions the Thread.sleep(milliseconds) method will throw
	// an exception given a number of special conditions. Since there´s a 
	// possibility that the Thread.sleep() throws an exception and we are
	// not handling it by the try-catch statements we are forced to add the 
	// "throws" keyword at the end of the calling method to signify that 
	// there's a possibility that this calling method will also throw that
	// kind of exception.
	public static void mySleep1(int seconds) throws InterruptedException {
		Thread.sleep(seconds * 1000);
	}
	
	// This is also a custom method that does the same thing as mySleep1. 
	// However this method doesn't need the "throw" keyword. This is because
	// we are handling the possible exception thrown by the Thread.sleep()
	// method with a try-catch statement. In those cases there's not need 
	// of the "throws" keyword at the end of the method
	public static void mySleep2(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException myException) {
			System.out.println("There was a Interruption Exception");
			System.out.println(myException.getStackTrace());
		}
	}

}
