package threadExecutionMethods;

class MyThread3 extends Thread 
{
    @Override
    public void run()
    {
	for(int i=0;i<5;i++)
	{
	    	System.out.println("Child Thread");
        	try
        	{
        	    Thread.sleep(2000);
        	} catch (InterruptedException e)
        	{
        	    e.printStackTrace();
        	}
	}
    }
}



public class JoinDemo2 
{

    public static void main(String[] args) throws InterruptedException
    {
	MyThread3 t = new MyThread3();
	t.start();
	// Now Main Thread will wait only for 5 sec and after that continues its execution irrespective
	// of Child Thread is completed or not.
	t.join(5000);
	for(int i=0;i<5;i++)
	{
	    System.out.println("Main Thread");
	}

    }

}
