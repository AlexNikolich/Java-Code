
public class PrintGrade {
	public String print(int grade){
		if(grade>93)
			return "You got an A!";
		else if(grade>83)
			return "You receive a B";
		else
			return "You need to study more";
	}
}
