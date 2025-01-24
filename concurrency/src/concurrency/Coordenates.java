/* ============================= synchronized ====================================
 * This is a custom class. The method incrementX() and IncrementY() are not thread safe.
 * A operation or method is thread safe when it can be used by several threads without
 * loosing any value.
 * Imagine the following scenario, we have created an object of this class and 2 or more
 * threads are trying to increment the value of x of this object. Increment a variable 
 * involves several steps at the CPU level: fetching the vale from memory and storing it
 * to a CPU registry, incrementing the value and storing the new incremented value in
 * memory. Operations that have more than one step to complete are called non-atominc.
 * Since in this scenario 2 threads are trying to increment X the following list
 * of events could happen
 * 0. Assume x = 0
 * 1. Thread 1 retrieves the value of x from memory (0) and store it in registry A
 * 2. Thread 2 retrieves the value of x from memory (0) and store it in registry B
 * 3. Thread 1 increments the value of X in registry A (1)
 * 4. Thread 2 increments the value of X in registry B (1)
 * 5. Thread 1 stores the new value registry A in memory (x=1)
 * 5. Thread 2 stores the new value registry B in memory (x=1)
 * 
 * Now x = 1 even though both threads have incremented x by 1. X should be 2 and no 1.
 * 
 * This happens because neither incrementX() nor incrementY() methods are thread safe
 * 
 * To solve this problem we could add the "synchronized" keyword in the definition of
 * both methods. What the "synchronized" does is that the thread that is trying to use 
 * this method will check if any other thread is using this OR ANYOTHER SYNCHRONIZED
 * METHOD of this class. If no other thread is using this method or another synchronized
 * method of this class the thread executed the method, otherwise will wait until it
 * can execute it. This causes another problem: what would happen if one thread wants
 * to increment X and other thread wants to increment Y at the same time?; since both
 * incrementX() and incrementY() are both synchronized methods only one thread will be
 * able to execute any of those methods at any given time, this is a waste of time 
 * because x and y are independent and incrementing one should not affect the other.
 * 
 * To solve that problem JAVA came up with locks. With lock while the lock is set,
 * no other thread will be able to execute this method, other threads will be able
 * to execute any other methods that do not have the lock set.
 * */
package concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class Coordenates {
	private float x;
	private float y;
	
	private final ReentrantLock lock_x = new ReentrantLock();
	private final ReentrantLock lock_y = new ReentrantLock();
	
	// Constructor
	public Coordenates(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	// Getters and Setters
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	// Increment operations of x and y. These methods are not thread safe
	// unless the "synchronized" keyword is provided
	synchronized public void incrementX() {
		this.x++;
	}
	
	synchronized public void incrementY() {
		this.y++;
	}
	
	public void incrementX_2() {
		lock_x.lock(); // Get the lock
		this.x++;
		lock_x.unlock(); // release the lock
	}
	
	public void incrementY_2() {
		lock_y.lock(); // Get the lock
		this.y++;
		lock_y.unlock(); // release the lock
	}
}
