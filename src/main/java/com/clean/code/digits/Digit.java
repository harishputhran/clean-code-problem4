package com.clean.code.digits;

/**
 * Digit Interface Definition.
 * 
 * @author hputhr
 *
 */
public interface Digit {
	
	String EMPTY_STRING_LITERAL = "";
	String SPACE_STRING_LITERAL = " ";
	String ZERO_TEXT = "Zero";
	String NUMBER_0 = "0";
	
	int INDEX_ZERO = 0;
	int INDEX_ONE = 1;
	int INDEX_YWO = 2;
	
	String[] UNITS_TEXT = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	
	String getTextValueOfNumber(String inputNumber);
	
	
	
	
	
	
}
