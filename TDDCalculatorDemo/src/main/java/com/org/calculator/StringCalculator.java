package com.org.calculator;

public class StringCalculator {

	public int add(String input) {
		
		if(input == null || input.isEmpty()) {
			return 0;
		} else if(input.equals("1")){
			return 1;
		} else {
			if(input.startsWith("//")) {
				String delimiter = input.substring(2,3);
				input = input.replace("//" + delimiter, "");
				input = input.replace(delimiter, ",");
			}
			if(input.contains(",")) {
				String updatedInput = input.replace("\n", "");
				String[] stringNumbers = updatedInput.split(",");
				int output = 0;
				for(int i = 0; i < stringNumbers.length; i++) {
					int number =  Integer.parseInt(stringNumbers[i]);
					if(number < 0) {
						throw new NumberFormatException("Negative Number Not Allowed number passed is  " + number);
					}
					output = output + number;
				}
				return output;
			}
		}
		return -1;
	}

}
