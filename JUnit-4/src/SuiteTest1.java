import org.junit.Test;


import static org.junit.Assert.*;

import org.junit.Assert;

public class SuiteTest1 {
	
	@Test
	public void testPrintMessage(){
		int num = 5;
		System.out.println("Suite Test1 is executing");
		Assert.assertEquals(5,num);
	}
}
