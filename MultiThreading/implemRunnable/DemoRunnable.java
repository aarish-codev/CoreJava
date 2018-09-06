package implemRunnable;

class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println("Child thread");
		}
	}
	
}

public class DemoRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable r = new MyRunnable();	//r is the target runnable
		Thread t = new Thread(r); // if we don't pass r then default run() of thread class will execute.
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main thread");
		}
		
	}

}
