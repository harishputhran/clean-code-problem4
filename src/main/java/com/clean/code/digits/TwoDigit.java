package com.clean.code.digits;

import com.clean.code.text.TextGenerator;

/**
 * Implementation for a Two digit number. 
 * 
 * @author hputhr
 *
 */
public class TwoDigit implements Digit {
	
	protected String[] TENS_COMMONTEXT = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	
	private TextGenerator textGenerator;
	
	public TwoDigit(){
		this.textGenerator = new TextGenerator();
	}
	
	public String getTextValueOfNumber(String inputNumber) {		
		
		textGenerator.generateText(findDigitAtTensPlace(inputNumber.substring(0,1)));
		
		SingleDigit singleDigit = new SingleDigit(Boolean.TRUE);		
		String textForNumberAtUnitsPlace = singleDigit.getTextValueOfNumber(inputNumber.substring(1));
		
		return textGenerator.generateText(textForNumberAtUnitsPlace).trim();
	}
	
	private String findDigitAtTensPlace(String inputNumberAtTensPosition) {
		if(!inputNumberAtTensPosition.equals(NUMBER_0)){
			return TENS_COMMONTEXT[Integer.valueOf(inputNumberAtTensPosition) - 1];
		}
		return EMPTY_STRING_LITERAL;		
	}
}
