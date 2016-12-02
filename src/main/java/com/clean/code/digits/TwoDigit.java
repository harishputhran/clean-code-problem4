package com.clean.code.digits;

import com.clean.code.text.TextGenerator;

public class TwoDigit implements Digit {
	
	private TextGenerator textGenerator;
	
	public TwoDigit(){
		this.textGenerator = new TextGenerator();
	}
	
	protected String[] TENS_COMMONTEXT = {"Ten", "Twenty", "Thrity", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

	public String getTextValueOfNumber(String inputNumber) {		
		textGenerator.generateText(findTensPlace(inputNumber.substring(0,1)));		
		textGenerator.generateText(SPACE_STRING_LITERAL);
		
		SingleDigit singleDigit = new SingleDigit();		
		return textGenerator.generateText(singleDigit.getTextValueOfNumber(inputNumber.substring(1,2)));
	}
	
	private String findTensPlace(String inputNumberAtTensPosition) {
		if(!inputNumberAtTensPosition.equals(0)){
			return TENS_COMMONTEXT[Integer.valueOf(inputNumberAtTensPosition) - 1];
		}
		return EMPTY_STRING_LITERAL;		
	}
}
