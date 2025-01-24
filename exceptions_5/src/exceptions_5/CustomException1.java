/* ======================== Custom Exceptions =========================
 * You can also have custom exception thrown by your code. To create a 
 * custom exception you must extend the class of exception you want. 
 * In this particular case we are extending the the Exception class, but
 * you can extended any exception class below Exception class as well.
 * In the class constructor we pass the message parameter so that is 
 * the message will be shown when the exception is thrown
 * */

package exceptions_5;

public class CustomException1 extends Exception {
	private String message;
	
	public CustomException1(String message) {
		super(message);
	}
}
