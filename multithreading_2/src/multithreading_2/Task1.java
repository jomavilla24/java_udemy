package multithreading_2;

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
