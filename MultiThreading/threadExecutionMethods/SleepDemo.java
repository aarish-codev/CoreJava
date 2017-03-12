package threadExecutionMethods;





public class SleepDemo
{

    public static void main(String[] args) throws InterruptedException
    {
	System.out.println("SLIDE ROTATOR/CHANGER");
	for(int i=0;i<5;i++)
	{
	    System.out.println("Slide No: "+i);
	    Thread.sleep(2000);
	}
	System.out.println("---------------------------------------");
	System.out.println("BULB FLASHER");
	for(int i=0;i<5;i++)
	{
	    System.out.println("On");
	    Thread.sleep(2000);
	    System.out.println("Off");
	    Thread.sleep(2000);
	}
	

    }

}
