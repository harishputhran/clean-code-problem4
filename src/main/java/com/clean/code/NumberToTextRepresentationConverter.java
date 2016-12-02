package com.clean.code;

import com.clean.code.text.TextGenerator;

public class NumberToTextRepresentationConverter {
	
	private TextGenerator textGenerator;
	
	public NumberToTextRepresentationConverter(){
		this.textGenerator = new TextGenerator();
	}

	public String textualRepresentation(int number) {
		return textGenerator.generateText(number);
	}
}
