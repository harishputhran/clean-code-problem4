package com.clean.code.digits;

public class TwoDigit implements Digit {
	
	protected String[] TENS_COMMONTEXT = {"Ten", "Twenty"};

	public String getTextValueOfNumber(String inputNumber, boolean excludeZeroFromText) {
		StringBuilder builder = new StringBuilder(3);
		builder.append(findTensPlace(inputNumber.substring(0,1)));
		builder.append(SPACE_STRING_LITERAL);
		SingleDigit singleDigit = new SingleDigit();
		builder.append(singleDigit.getTextValueOfNumber(inputNumber.substring(0,1), Boolean.TRUE));
		return builder.toString().trim();
	}
	
	private String findTensPlace(String inputNumberAtTensPosition) {
		if(!inputNumberAtTensPosition.equals(0)){
			return TENS_COMMONTEXT[Integer.valueOf(inputNumberAtTensPosition) - 1];
		}
		return EMPTY_STRING_LITERAL;
		
	}

}
