/*========================= Extending the Thread Class ========================
 * To implement a multi-threading task you must.
 * 1. Create a new custom class that extends Thread Class (in this example Task1)
 * 2. Create a new object of the newly created class (in this example t1)
 * 3. Run the task by invoking the start() method (in this example t1.start())
 * */
package multithreading_1;

public class Task1 extends Thread {

	// When implementing multi-threading with threads class you MUST include
	// this signature method
	public void run() {
		// Here you put the code you want the task to do. In this case it is 
		// a simple loop that will take some time to execute.
		System.out.println("============= Task 1 started ===========");
		for(int i = 100; i <= 199; i++) {
			System.out.println("Task 1 counter : " + i);
		}
		System.out.println("Task 1 DONE!");
	}
}
