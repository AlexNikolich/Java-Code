
public class HelloRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello from "+Thread.currentThread().getName()+ " "
				+ " a thread create by " 
				+ "implementing a Runnable Interface");	
	}

	
}
