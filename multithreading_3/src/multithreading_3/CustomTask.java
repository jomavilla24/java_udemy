package multithreading_3;

// This is an example of a sub class of the Thread super class. This sub class
// accepts a the task id as parameter 
public class CustomTask extends Thread {
	private int taskId;

	public CustomTask(int taskId) {
		this.taskId = taskId;
	}
	
	// When implementing multi-threading with threads class you MUST include
	// this signature method
	public void run() {
		// Here you put the code you want the task to do. In this case it is 
		// a simple loop that will take some time to execute.
		System.out.println("\n============= Task " + taskId + " started ===========");
		for(int i = taskId*100; i <= (taskId*100 + 99); i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n Task " + taskId + " DONE!");
	}
}
