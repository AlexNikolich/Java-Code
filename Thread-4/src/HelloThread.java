
public class HelloThread extends Thread{

	public void run() {
		System.out.println("Hello from "+Thread.currentThread().getName()+ " "
				+ " a thread create by " 
				+ "extending Thread class!!!");	
	}

}
