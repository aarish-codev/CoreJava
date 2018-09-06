package Cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class DemoListIterator {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			l.add(i);
		}
		System.out.println("Initial ArrayList: "+l);
		System.out.println("-----------------------------------------------------");
		ListIterator ltr = l.listIterator();
		System.out.println("Using ListIterator next()\n");
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());

		}
		System.out.println("-----------------------------------------------------\n");
		System.out.println("Prev Index: "+ltr.previousIndex());
		System.out.println("Next Index: "+ltr.nextIndex());
		System.out.println("Has Previous: "+ltr.hasPrevious());
		System.out.println("Has Next: "+ltr.hasNext());
		// Replace the last element returned by next() to Object obj
		ltr.set(new Integer(11));
		//ltr.set(12);
		// Removes the last element returned by next()
		System.out.println("Set Method:\t "+l);
		ltr.remove();
		System.out.println("Remove Method:\t "+l);
		ltr.add(10);
		System.out.println("Add Method:\t "+l);
		
		
		
	}

}
