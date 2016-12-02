package com.clean.code;

import java.util.ArrayList;
import java.util.List;

public class DecimalValueFinder {
	
	private static final String EMPTY_STRING_LITERAL = "";
	private static final String ZERO_TEXT = "Zero";
	private static final String NUMBER_0 = "0";
	private String[] TENS_COMMONTEXT = {"Ten", "Twenty"};
	private String[] UNITS_TEXT = {"One", "Two"};
	
	public List<String> retrieveDecimalValues(int number){
		
		List<String> decimalValuesInText = new ArrayList<>(10);		
		String numbericString = String.valueOf(number);		
		int numberOfDigits = numbericString.length();
		
		switch(numberOfDigits){
			case 1: {
						decimalValuesInText.add(findUnitsPlace(numbericString, Boolean.FALSE)); 
						break;
					 }
			case 2:  {
						decimalValuesInText.add(findTensPlace(numbericString.substring(0,1)));
						decimalValuesInText.add(findUnitsPlace(numbericString.substring(1, 2), Boolean.TRUE));
						break;
					 }			
			}
			return decimalValuesInText;
		}	

	private String findTensPlace(String inputNumberAtTensPosition) {
		if(!inputNumberAtTensPosition.equals(0)){
			return TENS_COMMONTEXT[Integer.valueOf(inputNumberAtTensPosition) - 1];
		}
		return EMPTY_STRING_LITERAL;
		
	}

	private String findUnitsPlace(String inputNumberAtUnitsPosition, Boolean zeroTextExclusionFlag) {
		if(inputNumberAtUnitsPosition.equals(NUMBER_0)){
			if(!zeroTextExclusionFlag){
				return ZERO_TEXT;
			}
			return EMPTY_STRING_LITERAL;
		}
		return UNITS_TEXT[Integer.valueOf(inputNumberAtUnitsPosition) - 1];
			
		
	}

}
