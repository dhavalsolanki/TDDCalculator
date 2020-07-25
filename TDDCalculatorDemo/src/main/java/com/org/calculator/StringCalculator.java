package com.org.calculator;

public class StringCalculator {

	public int add(String input) {
		if(input == null || input.isEmpty()) {
			return 0;
		} else if(input.equals("1")){
			return 1;
		} else if(input.contains(",")) {
			String[] stringNumbers = input.split(",");
			return (Integer.parseInt(stringNumbers[0]) + Integer.parseInt(stringNumbers[1]));
		}
		
		return -1;
	}

}
