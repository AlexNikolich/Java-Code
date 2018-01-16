package Calculator.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Calculator.Subtract;

public class SubtractTest {

	@Test
	public void test() {
		System.out.println("minus");
		int a = 17;
		int b = 5;
		Subtract instance = new Subtract();
		int expResult = 12;
		int result = instance.minus(a,b);
		assertEquals(expResult, result);
	}

}
