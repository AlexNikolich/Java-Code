
public class A extends Thread{
	
	public void run(){
		
		for(int i=1; i<5; i++){
			try {
				if(i==2) sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("A: " + i);
		}
		System.out.println("Exit from A");
	}

}
