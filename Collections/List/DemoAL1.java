package List;

import java.util.ArrayList;


public class DemoAL1 {
	
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Constructor 1--> default  capacity = 10
		ArrayList l1 = new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(1, 15);
		System.out.println("-----------------Constructor methods------------------------");
		System.out.println("Size of l1: "+l1.size());
		System.out.println(l1);
		System.out.println("Element at index 1: "+l1.get(1));
		System.out.println(l1.isEmpty());
		System.out.println(l1.contains(20));
		System.out.println(l1.hashCode());
		System.out.println(l1.getClass().getName());
		// Constrcutor 2--> capacity = 20
		ArrayList l2 = new ArrayList(20);
		// Constructor 3
		Integer i = new Integer(10);
		ArrayList l3 = new ArrayList(i);
		
	}

}
