//	It has 11 methods present(1 private method also)
public class ObjectClassDemo
{
//    overriding toString()
    public String toString()
    {
	return "Rishi";
    }
//     Overridding hashCode()
    public int hashCode()
    {
	return 10;
    }
//    overriding equals()
    public boolean equals(Object obj)
    {
	if(obj instanceof ObjectClassDemo)
	    return true;
	else
	    return false;
    }
    
    
    public static void main(String[] args)  
    {
	// TODO Auto-generated method stub
	ObjectClassDemo obj = new ObjectClassDemo();
//	1) public String toString()
	String s = obj.toString();
	System.out.println(s);
//	2) public native in hashCode();
	int i = obj.hashCode();
	System.out.println(i);
//	3) public boolean equals(Object o)
	ObjectClassDemo obj2 = obj;
	System.out.println(obj.equals(obj2));
//	4) protected native Object clone() throws CloneNotSupportedException
	
//	Object objClone = obj.clone();
//	System.out.println(objClone);
	
//	5) protected void finalize() throws InterruptedException
	
//	6) public final getClass()
	System.out.println(obj.getClass());
	System.out.println(obj.getClass().getName());
	
//	7) public final void wait() throws IE
//	8) public final void wait(long ms) throws IE
//	9) public final void wait(long ms,int ns) throws IE
//	10)public native final void notify();
//	11) public native final void notifyAll();
	
    }

}
