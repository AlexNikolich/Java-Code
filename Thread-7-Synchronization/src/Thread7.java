
public class Thread7 {

	static double a = 10;
	static double b;
	static int counter = 1;
	
	public static void main(String[] args) {
		// Multithreaded - problems:
			// 1. race conditions, 2.data races, and 3.cached variables problems
		//for these application thread-unsafe
		// 1. race condition - when threads depend on relative timing
		// 2. data race - two or more threads access the same memory location
		
		//SYNCHRONIZATION - to solve problem 1. 2. 3.
		// Synchronization is JVM feature - prevent two threads to access critical section
		// Synchronization - safely update shared variables
		// Synchronization - can be applied to methods or code blocks
		// JVM supports it via monitors. Every Java object is associated with a monitor
		// Before a thread eneters a critical section, it must get a lock on the monitor
		// If the monitor is already locked, the thread is blocked
		// Shared variables are copied into thread's working memory (cash memory or local memory)
		// When Thread is one, values are back to main memory
		
		
		
		
		// Example 1 - wrong A, static a, static b
		Runnable r1 = () -> 
		{
			if(a == 10){
				try {
					Thread.sleep(500);
					b = a /2;
					System.out.println(Thread.currentThread().getName() + ": " + b);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Runnable r2 = () -> {
			a = 12;
		};
		
		Thread tA = new Thread(r1,"Thread A");
		Thread tB = new Thread(r2,"Thread B");
		
		tA.start();
		tB.start();		
		// Console: Thread A: 6.0
		
		
		//Example 2, static counter
		Runnable r = () ->{
			System.out.println("ID value: " + getID());
		};
		Thread one = new Thread(r,"one");
		one.start();
		Thread two = new Thread(r,"two");
		two.start();
		
	}

	private static synchronized int getID() {
		return counter++;
	}

}
