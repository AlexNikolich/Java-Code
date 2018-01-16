package Calculator.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Calculator.Divide;

public class DivideTest {

	@Test
	public void test() {
		System.out.println("quotient");
		int numerator = 0;
		int denominator = 0;
		Divide instance = new Divide();
		int expResult = 0;
		int result = instance.quontient(numerator, denominator);
		assertEquals(expResult, result);
		
		numerator = 10;
		denominator = 2;
		expResult = 5;
		result = instance.quontient(numerator, denominator);
		assertEquals(expResult, result);
	}

}
