package com.clean.code.digits;

import com.clean.code.text.TextGenerator;

public class FourDigit implements Digit {
	
	private final String THOUSAND_COMMON_TEXT = "Thousand";

	private ThreeDigit threeDigit;
	
	private TextGenerator textGenerator;
	
	public FourDigit(){
		this.threeDigit = new ThreeDigit();
		this.textGenerator = new TextGenerator();
	}

	@Override
	public String getTextValueOfNumber(String inputNumber) {
		textGenerator.generateText(findThousandthPlace(inputNumber.substring(0, 1)), THOUSAND_COMMON_TEXT);
		String textOfaNumberFromHundredthPlacer = threeDigit.getTextValueOfNumber(inputNumber.substring(1));
		return textGenerator.generateText(textOfaNumberFromHundredthPlacer).trim();	
	}
	
	private String findThousandthPlace(String inputNumberAtThousandthPosition) {
		if(!inputNumberAtThousandthPosition.equals(NUMBER_0)){
			return UNITS_TEXT[Integer.valueOf(inputNumberAtThousandthPosition) - 1];
		}
		return EMPTY_STRING_LITERAL;
	}
}
