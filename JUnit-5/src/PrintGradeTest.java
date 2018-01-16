import static org.junit.Assert.*;

import org.junit.Test;

//When you make class you can choose JUnitTestCase or JUnitTestSuite

//Unit test: method with @Test, import org.junit.Assert.*, test program logic

public class PrintGradeTest {

	@Test
	public void test() {
		PrintGrade pg = new PrintGrade();
		String result = pg.print(95);
		assertEquals("You got an A!", result);
	}

}
