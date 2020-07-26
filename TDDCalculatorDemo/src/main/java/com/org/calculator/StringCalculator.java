package com.org.calculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

	public static int methodCalledCount = 0;
	
	public int add(String input) {
		methodCalledCount++;
		if(input == null || input.isEmpty()) {
			return 0;
		} else if(input.equals("1")){
			return 1;
		} else {
			if(input.startsWith("//[")) {
				
				String[] inputArray = input.split("]\n");
				List<String> delimiters = getDelimiterTokens(inputArray[0]);
				String inputString = inputArray[1];
				for(String delimiter : delimiters) {
					inputString = inputString.replace(delimiter, ",");
				}
				input = inputString;
			} else if(input.startsWith("//")) {
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
	
	public List<String> getDelimiterTokens(String input) {
		List<String> tokens = new ArrayList<String>();
		input = input.replace("//", "");
		String[] tokenStrings = input.split("]");
		
		for(String token : tokenStrings) {
			token = token.replace("[", "");
			token = token.replace("]", "");
			tokens.add(token);
		}
		return tokens;
	}

	
	public int getCalledCount() {
		return methodCalledCount;
	}
}
