
public class ThreadTwo extends Thread {

	public static void main(String[] args) {
		ThreadTwo threadTwo = new ThreadTwo();
		threadTwo.start();
		
		try {
			threadTwo.start();
		} catch (Exception e) {
			System.out.println("The same thread can be start only one!!!" );
			System.out.println("Exception: " + e );
		}

	}
	
	public void run(){
		System.out.println("Thread is running");
	}

}
