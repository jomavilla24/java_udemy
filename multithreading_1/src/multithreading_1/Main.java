/*
 * =============================== Multi-threading programs ================================
 * In a singled threaded program each line of code is executed sequentially one after the
 * other from the top of your program to the bottom of your program. Let's say that one
 * line of your program starts a task that requires some amount of time to be completed, 
 * writing or reading data from an external data base for example, or writing or reading
 * data from a local disk. Those tasks take time to be completed, in the mean time your 
 * program will be idle until those task complete, once the task completed your program
 * will resume and can execute the rest of the lines of code in your program. 
 * 
 * With multi-threading you can take advantage of those idle times to execute other tasks
 * your program could have until the task that is taking time to complete completes executing.
 * Effectively, you can run 2 or more task in parallel with multi-threading.
 * 
 * In java there are 2 ways to implement multi-threading in your programs.
 * 1. By extending the Thread class
 * 2. By implementing the Runnable 
 * 
 * Any Thread has the following states:
 * 1. New: In this state is any threat that has been created with the new keyword nut not started
 * with the start() method yet.
 * 2. Running: The thread is currently being executed
 * 3. Runnable: The thread is ready to be run and is not waiting for anything
 * 4. Blocked/waiting: The thread is waiting for another task to resume execution (waiting) 
 * or it is waiting to an external source (reading from a database for example - blocked)
 * 5. Terminated/dead: The thread has ended its execution
 * */
package multithreading_1;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// Once we have extended the Thread class we can create of object 
		// of the class that extended Thread
		Task1 t1 = new Task1();
		
		// Optionally you can set a priority execution for any thread. The priority
		// is express as a integer from 1 to 10 (Defaults to 5). Higher priority  
		// means that the computer will try to execute the task with higher priority
		// first. It is important to notice that priority is just a request. The computer
		// will try to fulfill the request or honor it, but there could be situations
		// when this request can't be fulfilled
		t1.setPriority(10);
		
		// IMPORTANT: To start a muli-threaded task we MUST use the start()
		// method. The run() method will start a normal task (not multi-threaded)
		t1.start();
		
		// To create a multi-threaded task with the Runnable interface first you
		// must create a new object of the custom class that extended the Runnable
		// interface
		Task2 t2 = new Task2();
		// Then you must create a object of Thread class that takes t2 object as
		// an argument
		Thread thread2 = new Thread(t2);
		// Now you use the start() method to start the multi-threaded task
		thread2.start();
		
		// Optionally we can have another task that will only be executed when the
		// task 1 and 2 are finished
		t1.join();
		thread2.join();
		// Task 3
		System.out.println("============= Task 3 started ===========");
		for(int i = 300; i <= 399; i++) {
			//System.out.println("Task 3 counter : " + i);
		}
		System.out.println("Task 3 DONE!");

		/* Other important things
		 * The Thread.sleep(ms) allows you to pause the execution of a thread for ms mili-seconds
		 * 
		 * The Thread.yield() method hits the O.S scheduler that the current threat is yielding
		 * (giving up) the CPU time the scheduler has assigned to it. This is just a hit to the 
		 * scheduler, the scheduler can ignore the request and the thread won't be allowed to
		 * give back the CPU the scheduler has allocate to it.
		 * 
		 * The synchronized keyword in methods allow you to declare a method that is synchronized.
		 * Only one (and only one) thread can call synchronized method at any time. A thread will
		 * check if any other thread is currently using the synchronized method before executing it
		 * if no other method is using it the thread will execute the code in the method. However
		 * If another thread is currently using the synchronized method, the first thread will have
		 * to wait until the method returns before using it. This is useful when the method 
		 * operating in data that is shared between threads (for example a common file or a hash 
		 * table)
		 * */
	}

}
