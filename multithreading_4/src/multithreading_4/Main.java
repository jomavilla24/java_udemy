/* ====================== Returning value from a Thread =====================
 * To create a thread that returns a value you must create a class that
 * implements the Callable interface. Objects of this class, when executed
 * with the submit() method, will return a promise (Future<> data type). If 
 * you invoke the get() method on a promise you'll get the value that promise
 * returns
 * */
package multithreading_4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// creates a Executor Service instance
		ExecutorService exec1 = Executors.newFixedThreadPool(1);
		
		// To execute a Callable thread we use the submit() method. This method takes a instance of
		// a callable task as input. the submit() method returns a promise back (Future<>) data type
		Future<String> promise1 = exec1.submit(new CallableTask(1));
		
		// Once the thread is executed and finishes (the promise is resolved) we can get
		// its return value. Effectively the get() method will stop the execution of the MAIN thread
		// and won't execute any other line of code until the thread returns a value. Once the
		// thread returns a value the next line of code is executed
		String threadReturnedValue = promise1.get();
		
		// Now start a task in the Main thread. 
		System.out.println("\n ============= MAIN Task started ===========");
		for(int i = 0; i <= 99; i++) {
			System.out.print(i + " ");
		}
			
		System.out.println(threadReturnedValue);
		System.out.print("\n MAIN Task DONE!");
		
		exec1.shutdown();
	}

}
