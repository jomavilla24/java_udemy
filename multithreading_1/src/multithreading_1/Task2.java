/* ================================= Runnable Interface ===========================
 * The other way to implement multi-thread is by creating a new class that implements
 * the Runnable interface. Once the new class is created we create a new object of
 * that class (t2). The we create a Thread object that takes t2 as argument. Finally
 * we can call the start() method on the newly created threat object to start the
 * task
 * */
package multithreading_1;

public class Task2 implements Runnable {

	@Override
	public void run() {
		// Here to put the code you what the task to run
		System.out.println("============= Task 2 started ===========");
		for(int i = 200; i <= 299; i++) {
			System.out.println("Task 2 counter : " + i);
		}
		System.out.println("Task 2 DONE!");
	}

}
