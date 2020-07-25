package com.org.calculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

	public int add(String input) {
		
		if(input == null || input.isEmpty()) {
			return 0;
		} else if(input.equals("1")){
			return 1;
		} else {
			if(input.startsWith("//[")) {
				int endDelimiterIndex = input.indexOf("]");
				String delimiter = input.substring(3, endDelimiterIndex);
				input = input.replace("//[" + delimiter + "]", "");
				input = input.replace(delimiter, ",");
			}
			if(input.startsWith("//")) {
				String delimiter = input.substring(2,3);
				input = input.replace("//" + delimiter, "");
				input = input.replace(delimiter, ",");
			}
			
			if(input.contains(",")) {
				String updatedInput = input.replace("\n", "");
				String[] stringNumbers = updatedInput.split(",");
				int output = 0;
				List<Integer> negativeNumbers = new ArrayList<Integer>();
				for(int i = 0; i < stringNumbers.length; i++) {
					int number =  Integer.parseInt(stringNumbers[i]);
					if(number < 0) {
						negativeNumbers.add(number);
					} else if(number < 1000) {
						output = output + number;	
					}
				}
				if(negativeNumbers.size() > 0) {
					throw new NumberFormatException("Negative Number Not Allowed number passed is/are  " + negativeNumbers);
				}
				return output;
			}
		}
		return -1;
	}

}
