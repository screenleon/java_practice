package ntou.cs.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrigonometricFunctionsTest {

	@Test
	public void testSin() {
		TrigonometricFunctions test = new TrigonometricFunctions();
		assertEquals("0.5", test.sin(1, 2));
		assertEquals("Error!", test.sin(2, 1));
	}
	
	@Test
	public void testCon() {
		TrigonometricFunctions test = new TrigonometricFunctions();
		assertEquals("0.6", test.cos(0.3, 0.5));
		assertEquals("0.5", test.cos(1, 2));
		assertEquals("Error!", test.cos(-3, -1));
	}
	
	@Test
	public void testTan() {
		TrigonometricFunctions test = new TrigonometricFunctions();
		assertEquals("0.6", test.tan(0.3, 0.5));
		assertEquals("Not defined", test.tan(1, 0));
		assertEquals("Error!", test.tan(2, 1));
	}

}
