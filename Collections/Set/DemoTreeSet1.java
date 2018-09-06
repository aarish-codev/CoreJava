package Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet1
{

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Set<Integer> s = new TreeSet<>();
	s.add(2);
	s.add(5);
	s.add(1);
	s.add(9);
	s.add(6);
	s.add(4);
	s.add(3);
	
	System.out.println("SIZE: "+s.size());
	
//	Traversing method 1
	System.out.println("Traversing using Iterator");
	Iterator<Integer> itr = s.iterator();
	while(itr.hasNext()){
	    System.out.println(itr.next());
	}
	
//	Traversing method 2
	System.out.println("Traversing using for-each loop");
	for(Integer i:s){
	    System.out.println(i);
	}
	
    }

}
