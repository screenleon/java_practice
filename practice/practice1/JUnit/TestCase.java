package ntou;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestCase {
	
	@Test
	public void testMultiplyNum() {
		CalculatorLite test = new CalculatorLite();
		int result = test.multiplyNum(1,2);
		assertEquals(2,result);
	}
	@Test
	public void testAddNum() {
		CalculatorLite test = new CalculatorLite();
		int result = test.addNum(1,2);
		assertEquals(3,result);
	}
	@Test
	public void testMinusNum() {
		CalculatorLite test = new CalculatorLite();
		int result = test.minusNum(1,2);
		assertEquals(-1,result);
	}
}


