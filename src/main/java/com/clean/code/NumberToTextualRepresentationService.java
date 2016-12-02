package com.clean.code;

import com.clean.code.digits.Digit;
import com.clean.code.digits.FourDigit;
import com.clean.code.digits.SingleDigit;
import com.clean.code.digits.ThreeDigit;
import com.clean.code.digits.TwoDigit;

/**
 * Class consisting of operations for retrieving Textual Representation of an input number.
 * 
 * @author hputhr
 *
 */
public class NumberToTextualRepresentationService {
	
	/**
	 * To get the textual representation
	 */
	private Digit digit;
	
	
	/**
	 * Method To generate the textual representation
	 * @param number
	 * @return
	 */
	public String generateTextualRepresentation(int number){
		
		String numericString = String.valueOf(number);
		digit = dtermineDigitsOfNumber(numericString);
		if(digit == null){
			throw new IllegalArgumentException("Invalid Number.");
		}
		return digit.getTextValueOfNumber(numericString);
		
	}

	/**
	 * Used to create instances of Digit based the number of digits.
	 * 
	 * @param String
	 * @return Digit
	 */
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
