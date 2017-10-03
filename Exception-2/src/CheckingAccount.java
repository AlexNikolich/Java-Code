
public class CheckingAccount {

	private double balance;
	
	public CheckingAccount(){}
	
	public void deposit(double amount){
		balance += amount;
	}
	
	public void withdraw(double amount) throws InsufficientFundsException{
		
		if(amount <= balance){
			balance -= amount;
		}
		else{
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
			
		}
	}
	
	public double getBalance(){
		return balance;
	}
	
}
