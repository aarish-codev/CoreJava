package synchronized_Method;

//	This program gives regular output as the method 'wish' is synchronized.
class SyncDisplay
{
    public synchronized void  wish(String name)
    {
	for(int i=0;i<5;i++)
	{
	    System.out.print("Good Morning: ");
	    try{
		Thread.sleep(2000);
	    }
	    catch(Exception e){
	    }
	    System.out.println(name);
	}
    }
}


class SyncMyThread extends Thread
{
    SyncDisplay d;
    String name;
    SyncMyThread(SyncDisplay d, String name)
    {
	this.d = d;
	this.name = name;
    }
    @Override
    public void run()
    {
	d.wish(name);
    }
}

public class SynchronizedDemo
{
    
    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	 SyncDisplay d = new SyncDisplay();
	SyncMyThread t1 = new SyncMyThread(d, "Dhoni");
	SyncMyThread t2 = new SyncMyThread(d, "Kohli");
	t1.start();
	t2.start();
	
    }
    
    

}
