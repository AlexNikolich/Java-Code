import sun.rmi.runtime.NewThreadAction;

public class Thread8 {


    public static void main(String[] args) throws InterruptedException{


       CountDown CD = new CountDown();
       
       Runnable r1 = () -> {
    	 //How to synchronized object CD and the method printCount() 
    	 synchronized (CD) {
    		 CD.printCount(); 
		}    	   
    	 // NO SYNCHRONIZATION
//    	 CD.printCount();  
       };
       
       Thread one = new Thread(r1, "one");
       Thread two = new Thread(r1, "two");
       one.start();
       two.start();
       
    
    }
}


//CONSOLE:
//---   10
//---   9
//---   8
//---   7
//---   6
//---   5
//---   4
//---   3
//---   2
//---   1
//BlastOFF
//---   10
//---   9
//---   8
//---   7
//---   6
//---   5
//---   4
//---   3
//---   2
//---   1
//BlastOFF