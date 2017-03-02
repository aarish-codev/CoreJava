import java.util.Comparator;
import java.util.TreeSet;

public class DemoComparator{

	/* Comparator contains 2 methods-- compare() & equals()
	 * But we need to only override compare() as equals() implementation already present in Object class
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(20);
		System.out.println(t);	// O/P is customized sorting

	}
}	

	
	class MyComparator implements Comparator
	{
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		Integer i1 = (Integer)arg0;
		Integer i2 = (Integer)arg1;
		if(i1>i2)
			
			return -1;
		
		else if(i2>i1)
			return 1;
			
		else
		return 0;
	}
	}

