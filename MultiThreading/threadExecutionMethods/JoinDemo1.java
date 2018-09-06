package threadExecutionMethods;

class MyThread2 extends Thread 
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



public class JoinDemo1 
{

    public static void main(String[] args) throws InterruptedException
    {
	MyThread2 t = new MyThread2();
	t.start();
	// Main Thread will wait until Child Thread completes its execution
	t.join();
	for(int i=0;i<5;i++)
	{
	    System.out.println("Main Thread");
	}

    }

}
