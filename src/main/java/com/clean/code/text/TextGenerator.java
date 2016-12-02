package com.clean.code.text;

import java.util.List;

import com.clean.code.DecimalValueFinder;

public class TextGenerator {
	
	private DecimalValueFinder decimalValueFinder;
	private String[] TENS_TEXT = {"", "Ten", "Twenty"};
	private String[] UNITS_TEXT = {"Zero", "One", "Two"};
	
	public TextGenerator(){
		this.decimalValueFinder = new DecimalValueFinder();
	}
	
	public String generateText(int number){	
		List<Integer> decimalValues = this.decimalValueFinder.retrieveDecimalValues(number);
		StringBuilder builder = new StringBuilder();
		String unitPlaceText = "";
		if(decimalValues.get(1) != 0){
			builder.append(TENS_TEXT[decimalValues.get(1)]);
			unitPlaceText = decimalValues.get(0) != 0 ? 
							UNITS_TEXT[decimalValues.get(0)] : "";
		}else{
			unitPlaceText = UNITS_TEXT[decimalValues.get(0)];
		}
		
		builder.append(unitPlaceText);
		return builder.toString();		
	}
}
