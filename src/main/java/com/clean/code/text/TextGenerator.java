package com.clean.code.text;

import java.util.List;

import com.clean.code.DecimalValueFinder;

public class TextGenerator {
	
	private DecimalValueFinder decimalValueFinder;

	
	public TextGenerator(){
		this.decimalValueFinder = new DecimalValueFinder();
	}
	
	public String generateText(int number){	
		List<String> decimalValues = this.decimalValueFinder.retrieveDecimalValues(number);
		StringBuilder builder = new StringBuilder();
		decimalValues.stream().forEach((textValue) -> {
			{
				builder.append(textValue);
				builder.append(" ");
			}
		});
		String generateText = builder.toString();
		return generateText.trim();		
	}
}
