package extendingThread;
/*	Overriding start()
 * If we override start() then our method will be executed and new thread won' be created
 */
public class DemoThread3 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method");
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("start method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThread3 t = new DemoThread3();
		t.start();
		System.out.println("main method"); // Output produced only by main threads
			
	}

}
