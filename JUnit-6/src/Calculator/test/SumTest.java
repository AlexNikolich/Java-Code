package Calculator.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Calculator.Sum;

public class SumTest {

	@Test
	public void test() {
		System.out.println("summation");
		int[] nums = {1,2,3,4,5};
		Sum instance = new Sum();
		int expResult = 15;
		int result = instance.summation(nums);
		assertEquals(expResult, result);
		
	}

}
