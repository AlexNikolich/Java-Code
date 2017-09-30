import java.util.Scanner;

public class Password {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		boolean good = false;
		
		do{
			System.out.print("Enter a password: ");
			String userPassword = input.next();
			try {
				checkForDigits(userPassword);
				good = true;
			} catch (MustHaveNumberException e) {
				System.out.println(e + "\n");
			}
		}while(good == false);
		
	}

	public static void checkForDigits(String pwd) throws MustHaveNumberException{
		int digit= 0;
		for(int i=0; i < pwd.length(); i++){
			if(Character.isDigit(pwd.charAt(i))){
				digit++;
			}
		}
		
		if(digit == 0){
			throw new MustHaveNumberException(pwd);
		}
	}
}
