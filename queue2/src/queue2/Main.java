// ======================== Changing queue order ==================
// by default queues are sorted in ascending order we polled. In the next example
// we will change the sorting order of a priorityQueue using a custom
// comparator
package queue2;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// when the queue is created you can pass a new comparator. The queue will
		// use that comparator to sort the new queue
		Queue<String> animals = new PriorityQueue<>(new DescendingComparator());
		animals.addAll(List.of("zebra", "dog", "cat", "spider"));
		
		// notice that the queue will return its elements in descending order when polled
		// It is descending order because we used a custom comparator, otherwise the
		// default order will be ascending
		System.out.println(animals.poll()); // zebra
		System.out.println(animals.poll()); // spider
		System.out.println(animals.poll()); // dog
		System.out.println(animals.poll()); // cat
	}

}
