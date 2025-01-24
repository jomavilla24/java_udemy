package queue2;

import java.util.Comparator;

// The following comparator allow us to sort a queue in descending order. Notice that
// by default queues are sorted in ascending order. This comparator will allow us to
// change that behavior

public class DescendingComparator implements Comparator<String> {

	@Override
	public int compare(String string1, String string2) {
		return string2.compareTo(string1);
	}
	
}
