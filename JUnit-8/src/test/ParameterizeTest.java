package test;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.MathUtils;

@RunWith(value = Parameterized.class)
public class ParameterizeTest {
	
//	PAZIII - morao si rucno da importujes hamcrest i assertThat
//	allow to run multi parameters test
//	first class have to have Annotation @RunWidth(value = Parameterized.class)
//	define parameters an initilized in Constructor
//	@Parameters - add parameters with value
	
	private int numA;
	private int numB;
	private int expected;
	
	

	public ParameterizeTest(int numA, int numB, int expected) {
		super();
		this.numA = numA;
		this.numB = numB;
		this.expected = expected;
	}
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{1,1,2},
			{2,2,4},
			{3,2,5},
			{4,5,9},
			{5,5,10},
			{6,6,12},
			{7,8,15}
		});
	}



	@Test
	public void test() {
		assertThat(MathUtils.add(numA, numB), is(expected));
	}
}
