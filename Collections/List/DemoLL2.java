package List;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.RandomAccess;

public class DemoLL2 {
	@SuppressWarnings("rawtypes")
	// Compare with List.ArrayList.DemoLL2
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
		System.out.println(l instanceof Runnable);
	}

}
