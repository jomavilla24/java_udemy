/* ====================== Limiting the max numbers of threads ========================
 * Using the newFixedThreadPool(n) static method we can limit the max number of threads
 * that can be running at the same time.
 * */
package multithreading_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// The newFixedThreadPool(n) method allows you to control the max number of thread that are
		// going to be executed at the same time. In this example task 1 and 2 will be run at the same
		// time. 
		ExecutorService executor1 = Executors.newFixedThreadPool(2);
		
		executor1.execute(new CustomTask(1));
		executor1.execute(new CustomTask(2));
		executor1.execute(new CustomTask(3));
		executor1.execute(new CustomTask(4));
		executor1.execute(new CustomTask(5));
		
		executor1.shutdown();
	}

}
