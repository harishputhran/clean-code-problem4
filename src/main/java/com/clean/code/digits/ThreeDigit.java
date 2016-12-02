package com.clean.code.digits;

import com.clean.code.text.TextGenerator;

public class ThreeDigit implements Digit {

	private final String HUNDRED_COMMON_TEXT = "Hundred";
	
	private SingleDigit singleDigit;
	
	private TwoDigit twoDigit;
	
	private TextGenerator textGenerator;
	
	public ThreeDigit(){
		this.singleDigit = new SingleDigit();
		this.twoDigit = new TwoDigit();
		this.textGenerator = new TextGenerator();
	}

	public String getTextValueOfNumber(String inputNumber) {
		textGenerator.generateText(findHundredthPlace(inputNumber.substring(0, 1)), SPACE_STRING_LITERAL);		
		return textGenerator.generateText(twoDigit.getTextValueOfNumber(inputNumber.substring(1, 2)));
	}
	
	private String findHundredthPlace(String inputNumberAtHundredthPosition) {
		if(!inputNumberAtHundredthPosition.equals(0)){
			return singleDigit.UNITS_TEXT[Integer.valueOf(inputNumberAtHundredthPosition) - 1] + HUNDRED_COMMON_TEXT;
		}
		return EMPTY_STRING_LITERAL;
	}
}
