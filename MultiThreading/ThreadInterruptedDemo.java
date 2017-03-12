class MyThread2 extends Thread 
{
    @Override
    public  void run()
    {
	try
        {
	    for(int i=0;i<5;i++)
	    {	
           	    System.out.println("I am lazy Thread");
           	    System.out.println("I was supposed to run 5 times, each time wait for 5 sec but");
           	    Thread.sleep(5000);
	    }    
       	} catch (InterruptedException e)
       	{
       	    System.out.println("I got interrupted by main thread and got ended");
      	}
    }
}
public class ThreadInterruptedDemo
{

    public static void main(String[] args)
    {
	MyThread2 t = new MyThread2();
	t.start();
	t.interrupt();
	System.out.println("Main Thread ends");
    }
}
