package extendingThread;
/*	Overriding start()
 * If we override start() then our method will be executed and new thread won' be created
 */
public class DemoThread4 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method");
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
		System.out.println("start method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThread4 t = new DemoThread4();
		t.start();
		System.out.println("main method"); // Output produced only by main threads
			
	}

}
