
public class GetSetThreadNames extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		
		GetSetThreadNames t = new GetSetThreadNames();
		System.out.println(t.getName());
		
		Thread.currentThread().setName("Rishi's Thread");
		System.out.println(Thread.currentThread().getName());
		
		// to setName of thread
		/*
		t.setName("Rishi's Thread");
		System.out.println(t.getName());
		*/
				
	}

}
