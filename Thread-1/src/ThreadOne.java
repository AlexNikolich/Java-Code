
public class ThreadOne implements Runnable{	//or extends Thread

	public static void main(String[] args) {
		ThreadOne threadOne = new ThreadOne();
		Thread t = new Thread(threadOne);
		t.start();

	}

	public void run() {
		System.out.println("Thread is running!");
		
	}

}
