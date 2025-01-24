/* =============== Waiting for the return value of ALL threads ==================
 * In the following example we run 3 threads and we wait for the 3 threads to finish
 * so we can get their return values back to us. 
 * */
package multithreding_5;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// Create the executor service
		ExecutorService exec1 = Executors.newFixedThreadPool(3);
		
		// Create a list of 3 callable threads
		List<CallableTask> tasks = List.of(new CallableTask(1),
				new CallableTask(2), new CallableTask(3));
		
		// Now we can execute the 3 threads in parallel. By invoking the invokeAll(L) method
		// we are executing the 3 threads at the same time. This method returns a List of 
		// promises (Future<String>)
		List<Future<String>> promises = exec1.invokeAll(tasks);
		
		// Now by looping through the list of promises we can use the get() method on them
		// This will effectively wait for ALL the threads to finish before continuing with
		// the rest of the code.
		for(Future<String> promise:promises) {
			System.out.println(promise.get());
		}
		
		// Shutdown the threads
		exec1.shutdown();
	}
}
