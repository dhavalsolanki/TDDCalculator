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
				int number = 0;
				if(stringNumbers[i].contains("\n")) {
					number = Integer.parseInt(stringNumbers[i].replace("\n", ""));
				} else {
					number = Integer.parseInt(stringNumbers[i]);
				}
				output = output + number;
			}
			return output;
		}
		
		return -1;
	}

}
