package com.clean.code.digits;

public class SingleDigit implements Digit {
	
	protected String[] UNITS_TEXT = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	
	private Boolean zeroTextExclusionFlag;
	
	public SingleDigit(Boolean zeroTextExclusionFlag){
		this.zeroTextExclusionFlag = zeroTextExclusionFlag;
	}
	
	public String getTextValueOfNumber(String inputNumber) {
		return findUnitsPlace(inputNumber);
	}

	private String findUnitsPlace(String inputNumberAtUnitsPosition) {
		if(inputNumberAtUnitsPosition.equals(NUMBER_0)){
			if(!zeroTextExclusionFlag){
				return ZERO_TEXT;
			}
			return EMPTY_STRING_LITERAL;
		}
		return UNITS_TEXT[Integer.valueOf(inputNumberAtUnitsPosition) - 1];		
	}
}
