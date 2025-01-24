package queue1;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// Create an empty Priority Queue
		Queue<String> animals = new PriorityQueue<>();
		
		// Add a list of elements to the queue
		animals.addAll(List.of("zebra", "dog", "cat", "spider"));
		
		// Add a new element to the queue
		animals.offer("monkey");
		
		// The poll method will return elements from the queue in ascending order
		// by default. If no element remain in the queue null is returned
		System.out.println(animals.poll()); // cat
		System.out.println(animals.poll());	// dog
		System.out.println(animals.poll()); // monkey
		System.out.println(animals.poll()); // spider
		System.out.println(animals.poll()); // zebra
		System.out.println(animals.poll()); // null
	}

}
