/* ======================= Finally is ALWAYS executed =======================
 * The code inside the Finally statement is ALWAYS executed. In the example 
 * below when the line array[4] = 3; is executed it will throw an exception.
 * That exception will be catch by the catch statement and after that the
 * code inside the finally statement will be executed. But what would happen
 * if the code inside the try statement wouln't throw an exception? will the
 * code inside finally statement be executed even thought there's a return
 * statement inside the try statement? 
 * The answer is yes. Even thought the return statement will be executed
 * the code inside the finally statement will be executed.
 * 
 * Also note that these are the valid combinations of try-catch-finally:
 * try-catch-finally
 * try-catch
 * try-finally
 * 
 * The try alone is not valid code
 * */

package exceptions_3;

public class Main {

	public static void main(String[] args) {
		try {
			int[] array = {0,1,2};
			// The line below will throw a ArrayIndexOutOfBoundsException exception
			array[4] = 3;
			return;
		} catch (Exception e) {
			System.out.println("There was an exception");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally!");
		}

	}

}
