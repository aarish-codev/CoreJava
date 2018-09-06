package Set;

import java.util.HashSet;
import java.util.Iterator;

public class DemoHashSet2
{
    public static void main(String[] args) {
	
    
    HashSet<Integer> hs = new HashSet<>();
    hs.add(1);
    hs.add(2);
    hs.add(3);
    hs.add(4);
    hs.add(5);
    
    System.out.println(hs.contains(3));
    
    System.out.println(hs.remove(5));

//    Traversing method 1
    System.out.println();
    Iterator<Integer> it = hs.iterator();
    while(it.hasNext())
        {
    		System.out.println(it.next());
        }
    
//    Traversing method 2
    for(Integer i: hs)
	System.out.println(i);
    }
}
