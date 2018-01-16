//WAIT and NOTIFY API

// important when threads share data

//WAIT
// void wait();
// void wait(long millis);
// void wait(long millis, int nano);

//NOTIFY
// void notify();
// void notifyAll();

// waiting threads are known as the wait set
// Deadlock two threads or more are blocked for ever

//Example notify() - wait()
public class Thread9 {
	public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();
        synchronized(b){
            try{
                System.out.println("Waiting for second thread to complete...");
                b.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Total is: " + b.total);
        }
    }
}
class ThreadB extends Thread{
    int total;
    @Override
    public void run(){
        synchronized(this){
            for(int i=0; i<10 ; i++){
                total += i;
            }
            notify();
        }
    }

}

//END

//Concurrency Utilities
//extensive framework for threads
//includes: high-performance thread pool, framework for asynchronous task,
//Advantage: reduced programming effort, increased performance, reliability
//
//EXECUTORS, FORK/JOIN FRAMEWORK, CONCURRENT COLECTIONS, ATOMIC VARIABLES
//SYNCHRONIZERS, LOCKS

// Rnnuable NOT return value, if you need to return value use CALLABLE FUTURE -call()























