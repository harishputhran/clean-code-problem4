package com.clean.code;

import com.clean.code.digits.Digit;
import com.clean.code.digits.FourDigit;
import com.clean.code.digits.SingleDigit;
import com.clean.code.digits.ThreeDigit;
import com.clean.code.digits.TwoDigit;

public class NumberToTextualRepresentationService {
	
	private Digit digit;
	
	public String generateTextualRepresentation(int number){
		
		String numericString = String.valueOf(number);
		digit = dtermineDigitsOfNumber(numericString);
		if(digit == null){
			throw new IllegalArgumentException("Invalid Number.");
		}
		return digit.getTextValueOfNumber(numericString);
		
	}

	private Digit dtermineDigitsOfNumber(String numericString) {
		int numerOfDigits = numericString.length();
		switch(numerOfDigits){		
			case 1 : return new SingleDigit(Boolean.FALSE);
			case 2 : return new TwoDigit();
			case 3 : return new ThreeDigit();
			case 4 : return new FourDigit();	
		}
		return null;
	}
}
