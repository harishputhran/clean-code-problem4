package com.clean.code.text;


public class TextGenerator {
	
	private StringBuilder stringBuilder;
	
	public TextGenerator(){
		this.stringBuilder = new StringBuilder();
	}
	
	public String generateText(String... textValues){		
		for(String text : textValues)
		{
			stringBuilder.append(text);
			stringBuilder.append(" ");
		}
		return stringBuilder.toString();		
	}
}
