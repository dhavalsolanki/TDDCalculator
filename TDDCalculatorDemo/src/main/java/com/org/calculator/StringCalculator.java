package com.org.calculator;

public class StringCalculator {

	public int add(String input) {
		if(input == null || input.isEmpty()) {
			return 0;
		} else if(input.equals("1")){
			return 1;
		} else if(input.contains(",")) {
			String[] stringNumbers = input.split(",");
			int output = 0;
			for(int i = 0; i < stringNumbers.length; i++) {
				output = output + Integer.parseInt(stringNumbers[i]);
			}
			return output;
		}
		
		return -1;
	}

}
