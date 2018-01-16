package Calculator;

public class Sum {
	public int summation(int[] nums){
		int sum = 0;
		for(int num:nums){
			sum = sum + num;
		}
		return sum;
	}
}
