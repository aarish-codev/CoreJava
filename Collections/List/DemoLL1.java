package List;

import java.util.LinkedList;
import java.util.HashSet;

public class DemoLL1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Constructor 1
		LinkedList l = new LinkedList();
		for (int i = 1; i < 10; i++) {
			l.add(i);
		}
		System.out.println(l);
		l.addFirst(0);
		l.addLast(11);
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());

		l.removeLast();
		l.removeFirst();
		l.remove(); // removes the head element
		System.out.println(l);

		// Collection object
		HashSet m = new HashSet();
		m.add("rishi");
		m.add("Mishi");

		// Constructor 2
		LinkedList l2 = new LinkedList(m);
		System.out.println(l2);
	}

}
