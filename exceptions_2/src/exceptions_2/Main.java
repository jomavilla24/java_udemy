/* =============================== Exception handling ==========================
 * We can catch an exception and handling it with the try/catch statements
 * */
package exceptions_2;

public class Main {

	public static void main(String[] args) {
		// What happens is that the the code inside the try block is executed and if that
		// code throws an error the catch statements are executed. If there's more than one
		// catch statement the one with the most accurate exception will be executed. For 
		// example, in the code below, the code inside the try statement could throw 2 types
		// of exceptions: ArrayIndexOutOfBoundsException and NullPointerException. If line 19
		// is uncommented this will produce an ArrayIndexOutOfBoundsException and the first
		// catch statement will be executed because it matches the error being thrown by the 
		// the code. However, if only line 25 is uncommented the second catch statement will 
		// run. It is important to note that all Exception in JAVA are subclasses of the Super
		// Class Exception so the last catch statement in this code will act as a "catch all"
		// statement in case the other 2 catch statements above do not provide a sufficiently 
		// accurate match for the exception thrown by the try statement. Assuming there's no
		// catch all statement, if there's an exception that does not match any of the exceptions
		// specified in the catch statements, that exception will not be handled and the 
		// program will throw that exception.
		// The Finally statement is ALWAYS executed no matter what. It is useful to execute
		// code that MUST be always  for example closing opened files or connections, shooting
		// down threads, etc
		// There's an important note about the catch statement. You must specify your catch
		// statements in order from the most specific to the less specific, in that sense 
		// a catch statement that catches a NullPointerException must be first in the chain
		// later in that same chain we could have a catch statement that catches a RuntimeException
		// and finally in the same chain a catch statement that catches a exception of Exception class.
		// Failing on doing that will produce a compilation error.
		// 
		// You can also define 2 or more Exception classes in a catch statement by using the | 
		// operator catch(InterruptedException | RuntimeException myException)
		try {
			int[] array = {0,1,2};
			String str = null;
			
			// Uncomment the line below to produce an ArrayIndexOutOfBoundsException. This 
			// exception will be handled by the 1st catch statement 
			// array[5] = 4;
			
			// Uncomment the line bellow to produce an NullPointerException. This exception
			// will be handled by the 2nd catch statement
			// str.length();
			
			// Uncomment the line below to produce a ArithmeticException. This exception will
			// be handled by the 3rd catch statement (catch all)
			int x = 1/0;
		} catch (ArrayIndexOutOfBoundsException myException) { // CATCH 1
			System.out.println("============= CATCH 1 ==============");
			System.out.println("There was an Index out of bounds error, please fix it");
			System.out.println(myException.getMessage());
		} catch (NullPointerException myException) { // CATCH 2
			System.out.println("============= CATCH 2 ==============");
			System.out.println("There was an Null pointer exception, please fix it");
			System.out.println(myException.getMessage());
		} catch (Exception myException) { // Catch ALL
			System.out.println("============= CATCH ALL ==============");
			System.out.println("There was an exception, please fix it");
			System.out.println(myException.getMessage());
		} finally { // FINALLY
			// The code inside the Finally statement is ALWAYS executed. There's only 2 exceptions
			// to that rule:
			// 1. When the code inside the Finally statement throws an exception
			// 2. When the code above the Finally statement stop the Java virtual machine with the
			// System.exit(0) statement.
			// In those cases the code in the Finally statement might not be completely executed
			System.out.println("============= Finally ==============");
			System.out.println("Housekeeping shores here");
		}

	}

}
