package Set;

import java.util.ArrayList;
import java.util.HashSet;

public class DemoHashSet1 {
	@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
	
	// Has no own methods thus use Collection methods only
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Constructor 1--> Def size=16 and Fill Ratio=0.75
		HashSet h1 = new HashSet();
		// Constructor 2--> Define capacity(int)
		int capacity = 20;
		HashSet h2 = new HashSet(capacity);
		// Constructor 3--> Define capacity(int) and Fill ratio(float)
		int capacity2=30;
		float loadFactor=0.90f;
		HashSet h3 = new HashSet(capacity,loadFactor);
		// Constructor 4--> Takes a Collection Object as argument
		ArrayList l = new ArrayList();
		for (int i = 1; i < 10; i++) {
			l.add(i);
		}
		HashSet h4 = new HashSet(l);
		System.out.println("HashSet Constructor having Collection Object:\n "+h4);
		// Adding duplicate value --> add() will return false, however no Compile/Run time error occur
		System.out.println("Adding duplicate value returns: "+h4.add(2));		// Duplicate Value
		System.out.println("Adding non-duplicate value returns: "+h4.add(10));		// Non-duplicate Value
	}

}
