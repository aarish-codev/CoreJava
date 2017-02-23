package Cursors;

import java.util.Vector;
import java.util.Enumeration;

public class DemoEnumeration {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		for(int i =1;i<=10;i++)
		{
			v.add(i);
		}
		System.out.println(v);
		
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			//Integer I = (Integer)e.nextElement();
			//System.out.println(I);
			System.out.println(e.nextElement());
		}
		
	}
}
