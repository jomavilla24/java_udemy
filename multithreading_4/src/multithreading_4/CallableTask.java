package multithreading_4;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {
	
	private int taskId;
	
	// Constructor
	public CallableTask(int taskId) {
		super();
		this.taskId = taskId;
	}

	// All classes that implement the Callable interface MUST implement the call()
	// method
	@Override
	public String call() throws Exception {
		// Here you can put the code you want the task to execute
		System.out.println("\n============= Task " + taskId + " started ===========");
		for(int i = taskId*100; i <= (taskId*100 + 99); i++) {
			System.out.print(i + " ");
		}
		// This is the value that the thread will return once it finishes it execution
		return "\n Task " + taskId + " DONE!" ;
	}

}
