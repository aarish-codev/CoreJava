class MyThread extends Thread
{
	public void run()
	{
	    System.out.println("child thread");
	}
}


public class DemoSetnGetThreadPriority {

	public static void main(String[] args) 
	{
	    System.out.println("Main Priority: "+Thread.currentThread().getPriority());
	    MyThread t = new MyThread();
	    System.out.println("Before setting thread priority: "+t.getPriority());
	    t.setPriority(7);
	    //t.setPriority(15);	// It can be only 1 to 10 else [ RE:IllegealStateEcxeption ]
	    System.out.println("After setting thread priority: "+t.getPriority());
 	}

}
