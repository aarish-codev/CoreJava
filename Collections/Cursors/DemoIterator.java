package Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoIterator {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			l.add(i);
		}
		System.out.println(l);
		System.out.println("-------------------------------------------\n");
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			Integer I = (Integer) itr.next();
			if (I % 2 == 0)
				System.out.println(I);
			else
				itr.remove();
		}
		System.out.println("\nNew ArrayList is: "+l);
	}
}
