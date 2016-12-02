package com.clean.code.digits;

public class SingleDigit implements Digit {
	
	protected String[] UNITS_TEXT = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	
	public String getTextValueOfNumber(String inputNumber) {
		return findUnitsPlace(inputNumber, Boolean.FALSE);
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
