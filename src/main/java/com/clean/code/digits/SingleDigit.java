package com.clean.code.digits;

/**
 * Implementation for a Single digit number. 
 * 
 * @author hputhr
 *
 */

public class SingleDigit implements Digit {
	
	private Boolean zeroTextExclusionFlag;
	
	public SingleDigit(Boolean zeroTextExclusionFlag){
		this.zeroTextExclusionFlag = zeroTextExclusionFlag;
	}
	
	public String getTextValueOfNumber(String inputNumber) {
		return findDigitAtUnitsPlace(inputNumber);
	}

	private String findDigitAtUnitsPlace(String inputNumberAtUnitsPosition) {
		if(inputNumberAtUnitsPosition.equals(NUMBER_0)){
			if(!zeroTextExclusionFlag){
				return ZERO_TEXT;
			}
			return EMPTY_STRING_LITERAL;
		}
		return UNITS_TEXT[Integer.valueOf(inputNumberAtUnitsPosition) - 1];		
	}
}
