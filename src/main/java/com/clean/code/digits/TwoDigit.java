package com.clean.code.digits;

import com.clean.code.text.TextGenerator;

/**
 * Implementation for a Two digit number. 
 * 
 * @author hputhr
 *
 */
public class TwoDigit implements Digit {
	
	private String[] TENS_COMMONTEXT = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	
	private String[] TEN_TO_TWENTY_TEXT = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	
	private TextGenerator textGenerator;
	
	public TwoDigit(){
		this.textGenerator = new TextGenerator();
	}
	
	public String getTextValueOfNumber(String inputNumber) {
		Integer inputNumerIntValue = Integer.valueOf(inputNumber);
		if(inputNumerIntValue > 10 && inputNumerIntValue < 20){
			return TEN_TO_TWENTY_TEXT[inputNumerIntValue - 10]; // This logic is only for numbers greater than 10 and less than 20.
		}
		textGenerator.generateText(findDigitAtTensPlace(inputNumber.substring(INDEX_ZERO, INDEX_ONE))); // Get the first Element/Attribute
		
		SingleDigit singleDigit = new SingleDigit(Boolean.TRUE);		
		String textForNumberAtUnitsPlace = singleDigit.getTextValueOfNumber(inputNumber.substring(1)); // Get the Remaining Attributes
		
		return textGenerator.generateText(textForNumberAtUnitsPlace).trim();
	}
	
	private String findDigitAtTensPlace(String inputNumberAtTensPosition) {
		if(!inputNumberAtTensPosition.equals(NUMBER_0)){
			return TENS_COMMONTEXT[Integer.valueOf(inputNumberAtTensPosition) - 1];
		}
		return EMPTY_STRING_LITERAL;		
	}
}
