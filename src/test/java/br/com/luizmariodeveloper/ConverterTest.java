package br.com.luizmariodeveloper;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class ConverterTest {
	
	@Test
	public void testConverterCelsiusToFarehintZero() {
		double celsius = 0;
		double farehint = ((celsius * 9)/5) + 32;
		
		assertEquals(new BigDecimal(farehint), new BigDecimal(32));
	}
	
	@Test
	public void testConverterCelsiusToFarehintCelsiusPositive() {
		double celsius = 10;
		double farehint = ((celsius * 9)/5) + 32;
		
		assertEquals(new BigDecimal(farehint), new BigDecimal("50"));
	}

	@Test
	public void testConverterCelsiusToFarehintCelsiusNegative() {
		double celsius = -10;
		double farehint = ((celsius * 9)/5) + 32;
		
		assertEquals(new BigDecimal(farehint), new BigDecimal("14"));
	}
}
