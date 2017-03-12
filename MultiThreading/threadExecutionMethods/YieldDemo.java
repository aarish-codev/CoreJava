package threadExecutionMethods;

class MyThread1 extends Thread
{
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
	for(int i=0;i<5;i++)
	{
	    System.out.println("Child Thread");
	    Thread.yield();
	}
    }
}

public class YieldDemo 
{

    public static void main(String[] args)
    {
	MyThread1 t = new MyThread1(); 	
	t.start();
	for(int i=0;i<5;i++)
	{
	    System.out.println("Main Thread");
	}
	
    }

}
