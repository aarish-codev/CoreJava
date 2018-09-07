package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoHM
{
    public static void main(String[] args) {
	Map<Integer, String> m = new HashMap<>();
	m.put(1, "Rishi");
	m.put(2,"Mishi");
	
	
	System.out.println(m.get(1));
	System.out.println(m.keySet());
	System.out.println(m.entrySet());
	System.out.println(m.containsKey(1));
//	System.out.println(m.remove(1));
	System.out.println();
	
//	Traversing method 1
	System.out.println("Traversing method 1");
	for(Map.Entry m1:m.entrySet())
	{
	System.out.println(m1.getKey()+ " : "+m1.getValue());
	}
	System.out.println();
	
//	Traversing method 2 
	System.out.println("Traversing method 2");
	Set s = m.entrySet();
	Iterator itr = s.iterator();
	while(itr.hasNext())
	{
	    Map.Entry<Integer, String> kv = (Map.Entry<Integer, String>)itr.next();
	    System.out.print("Key: "+kv.getKey());
	    System.out.println(" Value: "+kv.getValue());
	}
	
    }
}
