package List;

import java.io.Serializable;
import java.util.Vector;
import java.util.RandomAccess;

public class DemoVector2 {
	@SuppressWarnings("rawtypes")
	// Compare with List.ArrayList.DemoLL2  & List.LinkedList.DemoLL2 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector l = new Vector();
		
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
		System.out.println(l instanceof Runnable);
	}

}