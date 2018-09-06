package List;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;

public class DemoAL2 {
	@SuppressWarnings("rawtypes")
	// Compare with List.LinkedList.DemoLL2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
		System.out.println(l instanceof Runnable);
	}

}
