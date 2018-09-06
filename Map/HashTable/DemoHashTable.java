package HashTable;

import java.util.Hashtable;

public class DemoHashTable
{
    public static void main(String[] args) {
	
	Hashtable h = new Hashtable<>();
	h.put(1,"A");
	h.put(2,"B");
	h.put(4, "D");
	h.put(3,"C");
	h.put(3, "Z");
	
	System.out.println(h);
    }
}
