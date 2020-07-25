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
	
	@Test
	public void testAddAndReturn1() {
		int response = stringCalulator.add("1");
		Assert.assertEquals(1, response);
	}
	
	@Test
	public void testAddAndReturn4() {
		int response = stringCalulator.add("1,3");
		Assert.assertEquals(1, response);
	}
}
