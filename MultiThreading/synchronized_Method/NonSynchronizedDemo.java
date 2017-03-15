package synchronized_Method;

//	This program gives irregular output as the method 'wish' is not synchronized.

class Display
{
    public void wish(String name)
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

class MyThread extends Thread
{
    Display d;
    String name;
    MyThread(Display d, String name)
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

public class NonSynchronizedDemo
{

    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	Display d = new Display();
	MyThread t1 = new MyThread(d, "Dhoni");
	MyThread t2 = new MyThread(d, "Kohli");
	t1.start();
	t2.start();

    }

}
