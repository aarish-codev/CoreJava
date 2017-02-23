package List;

import java.util.Collection;
import java.util.Vector;

public class DemoVector1 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	// Difference in vector is that most methods are synchronized and it is
	// thread safe
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//		Constructor 1
		// Vector Methods
		Vector v = new Vector();
		v.add(1);
		v.add(1, "Rishi");
		v.add(3.0);
		Object o = v.elementAt(2);
		o = v.firstElement();
		System.out.println(o);
		System.out.println(v);
		System.out.println("SIZE: "+ v.size());
		System.out.println("CAPACITY: "+v.capacity());
		System.out.println("----------------------------------------------------------------");
		//		Constructor 2
		Vector v2 = new Vector(20);
		System.out.println(v2.capacity());
		System.out.println("-----------------------------------------------------------------");
		//		Constructor 3
		Vector v3 = new Vector(15, 5);
		System.out.println(v3.capacity());
		//		Constructor 4
		// It takes collection as argument
		Vector v4 = new Vector();
		}
	}


