package multithreading_2;

public class Task2 implements Runnable{

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
