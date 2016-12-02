package com.clean.code.digits;

import com.clean.code.text.TextGenerator;

public class TwoDigit implements Digit {
	
	private TextGenerator textGenerator;
	
	public TwoDigit(){
		this.textGenerator = new TextGenerator();
	}
	
	protected String[] TENS_COMMONTEXT = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

	public String getTextValueOfNumber(String inputNumber) {		
		
		textGenerator.generateText(findTensPlace(inputNumber.substring(0,1)));
		
		SingleDigit singleDigit = new SingleDigit(Boolean.TRUE);		
		String textForNumberAtUnitsPlace = singleDigit.getTextValueOfNumber(inputNumber.substring(1));
		
		return textGenerator.generateText(textForNumberAtUnitsPlace).trim();
	}
	
	private String findTensPlace(String inputNumberAtTensPosition) {
		if(!inputNumberAtTensPosition.equals(NUMBER_0)){
			return TENS_COMMONTEXT[Integer.valueOf(inputNumberAtTensPosition) - 1];
		}
		return EMPTY_STRING_LITERAL;		
	}
}
