package HashMap;

import java.util.HashMap;
import java.util.Map;

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
	System.out.println(m.remove(1));
	
	for(Map.Entry m1:m.entrySet())
	{
	System.out.print(m1.getKey());
	System.out.print(" : "+m1.getValue());
	System.out.println();
	}
	
	
    }
}
