package List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class DemoAL1 {
	
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		
	    ArrayList al1 = new ArrayList(10);
	    al1.add(1);
	    al1.add(3);
	    al1.add(1, 2);
	    
	    Collection c = new ArrayList();
	    c.add(4);
	    c.add(5);
	    c.add(6);
//	    c.add(3);
	    
	    al1.addAll(c);
	    
//	    System.out.println(al1.remove(5));
	    System.out.println(al1.retainAll(al1));
	    System.out.println(al1.size());
	    al1.trimToSize();
	    System.out.println(al1.size());
//	    System.out.println("Debug: "+al1);
//	    	Printing ArrayList elements
//	    Method 1
	    System.out.println("Using for each loop");
	    for(Object i: al1) {
		System.out.println(i);
	    }
//	    Method 2
	    System.out.println("using syso");
//	    System.out.println(al1);
//	    Method 3
	    System.out.println("Using for loop");
	    for(int i =0; i<al1.size(); i++){
		System.out.println(al1.get(i));
	    }
//	    Method 4
	    System.out.println("Using iterator");
	    Iterator<Integer> itr = al1.iterator();
	    while(itr.hasNext()){
		System.out.println(itr.next());
	    }
	    
	    
	    
		
	    
				
	}

}
