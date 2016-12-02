package com.clean.code.digits;

public class ThreeDigit implements Digit {

	private final String HUNDRED_COMMON_TEXT = "Hundred";
	
	private SingleDigit singleDigit;
	
	private TwoDigit twoDigit;
	
	public ThreeDigit(){
		this.singleDigit = new SingleDigit();
		this.twoDigit = new TwoDigit();
	}

	public String getTextValueOfNumber(String inputNumber) {
		StringBuilder builder = new StringBuilder();
		builder.append(findHundredthPlace(inputNumber.substring(0, 1)));
		builder.append(SPACE_STRING_LITERAL);		
		builder.append(twoDigit.getTextValueOfNumber(inputNumber.substring(1, 2)));
		return builder.toString().trim();
	}
	
	private String findHundredthPlace(String inputNumberAtHundredthPosition) {
		if(!inputNumberAtHundredthPosition.equals(0)){
			return singleDigit.UNITS_TEXT[Integer.valueOf(inputNumberAtHundredthPosition) - 1] + HUNDRED_COMMON_TEXT;
		}
		return EMPTY_STRING_LITERAL;
	}

}
