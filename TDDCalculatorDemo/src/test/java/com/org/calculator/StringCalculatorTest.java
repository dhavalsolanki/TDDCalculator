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
		Assert.assertEquals(4, response);
	}
	
	@Test
	public void testAddAndReturn9() {
		int response = stringCalulator.add("1,3,5");
		Assert.assertEquals(9, response);
	}
	
	@Test
	public void testAddWithNewLineAndReturn5() {
		int response = stringCalulator.add("1\n,4");
		Assert.assertEquals(5, response);
	}
	
	@Test
	public void testAddCustomDlimiterAndReturn3() {
		int response = stringCalulator.add("//;\n1;2");
		Assert.assertEquals(3, response);
	}
	
	@Test(expected = NumberFormatException.class)
	public void testAddNegativeNumber() {
		int response = stringCalulator.add("-1,1");
		System.out.println(" response " + response);
		Assert.assertEquals(3, response);
	}
	
}
