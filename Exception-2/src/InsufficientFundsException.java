
public class InsufficientFundsException extends Exception{
	

	private static final long serialVersionUID = 4841466929950325352L;
	
	private double amount;
	public InsufficientFundsException(double amount){
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
