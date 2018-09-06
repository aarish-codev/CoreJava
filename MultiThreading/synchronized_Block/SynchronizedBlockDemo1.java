package synchronized_Block;

/*
 * This program uses synchronization block to get lock of current object
 */

class Display1
{
    	public void wish(String name)
    	{
    	    // 10000 lines of code
    	    synchronized (this)
	    {
		for(int i=0;i<5;i++)
		{
		    System.out.print("Good Morning: ");
		    try{
			Thread.sleep(2000);
		    }
		    catch(Exception e){}
		    System.out.println(name);
		}
	     // 10000 lines of code
	    }
    	}
}
 
 class MyThread1 extends Thread
 {
     Display1 d;
     String name;
     MyThread1(Display1 d,String name)
     {
	 this.d = d;
	 this.name = name;
     }
     public void run()
     {
	 d.wish(name);
     }
 }

public class SynchronizedBlockDemo1
{
     public static void main(String[] args)
    {
	Display1 d = new Display1();
	MyThread1 t1 = new MyThread1(d, "Rishi");
	MyThread1 t2 = new MyThread1(d, "Mishi");
	t1.start();
	t2.start();
    }
}

