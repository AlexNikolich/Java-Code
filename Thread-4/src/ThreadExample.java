import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class ThreadExample {

	public static void main(String[] args) {
		
//		Every Java program at least a default main thread
//		A thread is an independent path of code execution
//		You can run them in the background
//		Runnables are objects that encapsulate code sequence
//		Each thread executes a runnable object
//		Threads can initiate an asynchronous task
//		Java supports 	class java.lang.Thread and 
//						interface java.lang.Runnable 
		
//		Threads are either deamon or non-deamon
//		Deamon threads don't stop the JVM from ending
//		By default threads are non-deamon
//		Program end, but Java garbage collection runs on a deamon thread
//		The main() method is a non-deamon thread
	
		
//		New Thread() -> start() 
//				=> Runnable -> run()
//				=> Running -> sleep() -> Waiting
//				=> Dead
		
//		How to create thread? 
//				-1. Declare a new class as a subclass of the Thread class and
//				must override the run() method
//				-2. Create a new class that implements Runnable, must override run()
//				-3. Create a Runnable object and use a Thread constructor, must override run()
	
		
//		Create a thread!!
//			Thread()
//			Thread(Runnable obj)
//			Thread(Runnable obj, string name)
//			Thred(string name)
		
		
		///EXAMPLES///
		
		
		
		// Example 1, class HelloRunnable() implements Runnable
		new Thread(new HelloRunnable()).start();
				
		//Example 2, class HelloThread extends Thread
		new HelloThread().start();
		
		//Example 3, create Runnable object NOT using lambda
		Runnable r1 = new Runnable() {			
			@Override
			public void run() {
				System.out.println("Hello from "+Thread.currentThread().getName()+ " " 
						+ "NOT USING LAMBDA!!!!!");	
			
			}
		};
		//Example 4,Create runnable object using Lambda notation
			Runnable r2 = () -> System.out.println("Hello from "
	                 + Thread.currentThread().getName()+" USING LAMBDA "
	                 + "notation"); 	
		
		//WITH Example 3 Create an start a thread using the first runnable object
		Thread t1 = new Thread(r1);
		t1.start();
		
		//WITH Example 4, Create an start  thread using the second runnable object (Lambda)
		Thread t2 = new Thread(r2, "Thread t2");
		t2.start();
		
		
		
			
		

	}

}
