package com.org.calculator;

import org.junit.Test;

import junit.framework.Assert;

public class StringCalculatorTest {

	StringCalculator stringCalulator = new StringCalculator();
	
	@Test
	public void testReturnEmpty() {
		int response = stringCalulator.add("");
		
		Assert.assertEquals(0, response);
	}
}
