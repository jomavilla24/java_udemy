/*
 * =============================== Executor Service ==================================
 * The Executor Service task allows you to control several aspects of the execution of
 * threads in JAVA. For example it allows you to restrict the numbers of threads your 
 * program can run. Executor Service also allows you to control if you wan to pass the
 * result of a thread (the returning value of a thread) to another thread, or to control
 * if we want to wait until one thread or all thread must finish
 * */
package multithreading_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// The newSingleThreadExecutor() static method of the class Executors creates a Executor
		// service that will only allow to run one thread at a time. In the following example
		// Task 2 will run immediately after Task 1 is done. Since task 3 is outside the Service
		// executor, it will be run whenever Task 1 or Task 2 are idle in the CPU. In practice this
		// example will run like this.
		// Task 1 will be started, once task 1 has idle time in the CPU Task 3 will be started
		// Once Task 1 is done Task 2 will be started
		ExecutorService executor1 = Executors.newSingleThreadExecutor();
		// Run Task1 and Task2
		executor1.execute(new Task1());
		executor1.execute(new Thread(new Task2()));
		
		System.out.println("============= Task 3 started ===========");
		for(int i = 300; i <= 399; i++) {
			System.out.println("Task 3 counter : " + i);
		}
		System.out.println("Task 3 DONE!");
		
		// Stops the execution of threads
		executor1.shutdown();
	}
}

