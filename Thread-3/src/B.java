
public class B extends Thread{

public void run(){
		
		for(int j=1; j<5; j++){
			System.out.println("B: " + j);
		}
		System.out.println("Exit from B");
	}
}
