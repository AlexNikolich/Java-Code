package Calculator.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Calculator.Multiply;

public class MultiplyTest {

	@Test
	public void test() {
		System.out.println("times");
		int c = 10;
		int d = 34;
		Multiply instance = new Multiply();
		int expResult = 340;
		int result = instance.times(c, d);
		assertEquals(expResult, result);
		
	}

}
