package test;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;



public class ExceptionHandlingTest {

//	expected - use exception to avoid error
//	without expected will throw error
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void testMain() {
		new ArrayList<Object>().get(0);
	}
	
	@Test (expected = ArithmeticException.class)
	public void testDivideByZero() {
		int x = 10/0;
	}
	
	@Ignore("Skip this test for ivide by 0")
	@Test 
	public void testDivideByZeroIgnore() {
		int x = 10/0;
	}
	
}
