package com.clean.code.digits;

import com.clean.code.text.TextGenerator;

/**
 * Implementation for a Three digit number. 
 * 
 * @author hputhr
 *
 */

public class ThreeDigit implements Digit {

	private final String HUNDRED_COMMON_TEXT = "Hundred";
	
	private TwoDigit twoDigit;
	
	private TextGenerator textGenerator;
	
	public ThreeDigit(){
		this.twoDigit = new TwoDigit();
		this.textGenerator = new TextGenerator();
	}

	public String getTextValueOfNumber(String inputNumber) {
		textGenerator.generateText(findDigitAtHundredthPlace(inputNumber.substring(0, 1)), HUNDRED_COMMON_TEXT);// Get the first Element/Attribute	
		String textOfaNumberAtUnitsPlacer = twoDigit.getTextValueOfNumber(inputNumber.substring(1));// Get the Remaining AElement/ttributes
		return textGenerator.generateText(textOfaNumberAtUnitsPlacer).trim();	
	}
	
	private String findDigitAtHundredthPlace(String inputNumberAtHundredthPosition) {
		if(!inputNumberAtHundredthPosition.equals(NUMBER_0)){
			return UNITS_TEXT[Integer.valueOf(inputNumberAtHundredthPosition) - 1];
		}
		return EMPTY_STRING_LITERAL;
	}
}
