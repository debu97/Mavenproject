package in.gov.isro;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

	@Test
	public void testadd() {
		Calculator calc = new Calculator();
		int result = calc.add(5,5);
		assertEquals(10,result);
	}
	@Test
	public void testmultiply() {
		Calculator calc = new Calculator();
		int result = calc.multiply(5,5);
		assertEquals(25,result);
	}
	@Test
	public void testsubtract() {
		Calculator calc = new Calculator();
		int result = calc.subtract(10,5);
		assertEquals(5,result);
	}
}
