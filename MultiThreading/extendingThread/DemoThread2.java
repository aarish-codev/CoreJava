package extendingThread;

public class DemoThread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		MyThread2 t = new MyThread2();
		t.start();
		//		Call run(5) explicitly
		//   t.run(5);
	}

}

/* Even if we overload run() still start() will execute only no-arg run().
 * Other overloaded run() we have to call explicitly.
 */

class MyThread2 extends Thread
{
	@Override
	public void run() {
		System.out.println("no-arg method");
		}
	public void run(int t) {
		System.out.println("int-arg method");
	}
		
	
	
}