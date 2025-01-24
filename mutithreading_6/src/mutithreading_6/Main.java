package mutithreading_6;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// Create the executor service
		ExecutorService exec1 = Executors.newFixedThreadPool(3);
		
		// Create a list of 3 callable threads
		List<CallableTask> tasks = List.of(new CallableTask(1),
						new CallableTask(2), new CallableTask(3));
				
		// Now we can execute the 3 threads in parallel. By invoking the invokeAny(L) method
		// we are executing the 3 threads at the same time. This method returns the  return value
		// of the thread that finishes first
		String result = exec1.invokeAny(tasks);
		
		System.out.println(result);
				
		// Shutdown the threads
		exec1.shutdown();
	}

}
