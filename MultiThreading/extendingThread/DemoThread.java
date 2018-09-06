package extendingThread;

public class DemoThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		MyThread t = new MyThread();
		t.start(); 		// Unpredictible Output
	//	t.run(); 		// Predictible Output
		for(int i=0;i<5;i++)
			System.out.println("Main thread");

	}

}


class MyThread extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.println("Child thread");
		}
		
	
	}
}