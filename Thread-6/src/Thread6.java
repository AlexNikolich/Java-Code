
public class Thread6 {

	public static void main(String[] args) {
		// static and non-static methods for Threads
		// static for current thread
		// non-static on the calling thread
		
		//STATIC METHODS
		//activeCount() - return estimate number of threads
		//currentThread() - returns reference to current thread
			// using currentThread() we can use others methods for example
			// getName(), isAlive(), getState(), getPriority()
		// enumerate(Thread[] tarr) - list of active threads
		// sleep(long millis) - sleep or top execution
		
		
		//NON STATIC METHODS
		// join() - return estimated number of threads
		// interrupt() - returns reference to current thread
		
		
		
		//EXAMPLE 1 - join() when this thread finish, move to other
		TestJoinClass t1 = new TestJoinClass("t1");  
        TestJoinClass t2 = new TestJoinClass("t2");  
        TestJoinClass t3 = new TestJoinClass("t3");  
        t1.start(); 
//        with this try all 3 threads will be synchronized
//        try{  
//            t1.join();  
//        }catch(Exception e){System.out.println(e);}  
        t2.start();
        try{  
            t2.join();  
        }catch(Exception e){System.out.println(e);}  
        //thread 3 won't start until thread 2 is complete
        t3.start();
        
//        OUTPUT
//        t2 i = 1
//        t1 i = 1
//        t2 i = 2
//        t1 i = 2 		t1 an t2 not synchronize
//        t1 i = 3
//        t2 i = 3
//        t2 i = 4
//        t1 i = 4
//        t2 i = 5
//        t1 i = 5
//        t3 i = 1
//        t3 i = 2
//        t3 i = 3
//        t3 i = 4
//        t3 i = 5
        
	}

}
