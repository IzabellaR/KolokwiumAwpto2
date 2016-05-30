package kolokwium.c.pl.edu.us;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class MortgageCalculatorTest
{	
	private int parameter;
	 public AllTests(int testParameter) {
	 this.parameter = testParameter;
	 }
	 
	 @Parameters
	 public static Collection<Object[]> data() {
	 Object[][] data = new Object[][] { { 1 }, { 5 } };
	 return Arrays.asList(data);
	 }
	 
	 
	 @Test
	 public void test() {
	 }
	 
	 
	 
	@Test
	public void numberOfInstallmentsTest() {
		fail("Not yet implemented");
	}
	
	@Test
	public void valueOfFirstInstallmentsTest() {
		fail("Not yet implemented");
	}
	
	@Test
	public void valueOfLastInstallmentsTest() {
		fail("Not yet implemented");
	}
}