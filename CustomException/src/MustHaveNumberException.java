
public class MustHaveNumberException extends Exception{

	private static final long serialVersionUID = 9062869791195157243L;
	
		private String password;
		
		public MustHaveNumberException(String password){
			this.password = password;
		}
		
		public String toString(){
			return "Your password must contain at least one number!!!";
		}
}
