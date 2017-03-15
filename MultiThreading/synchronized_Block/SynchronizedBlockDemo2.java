package synchronized_Block;

/*
 * This program uses synchronization block to get class level lock 
 */

class Display2
{
    	public void wish(String name)
    	{
    	    // 10000 lines of code
    	    synchronized (Display2.class)
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
 
 class MyThread2 extends Thread
 {
     Display2 d;
     String name;
     MyThread2(Display2 d,String name)
     {
	 this.d = d;
	 this.name = name;
     }
     public void run()
     {
	 d.wish(name);
     }
 }

class SynchronizedBlockDemo2
{
     public static void main(String[] args)
    {
	Display2 d1 = new Display2();
	Display2 d2 = new Display2();
	MyThread2 t1 = new MyThread2(d1, "Rishi");
	MyThread2 t2 = new MyThread2(d2, "Mishi");
	t1.start();
	t2.start();
    }
}

