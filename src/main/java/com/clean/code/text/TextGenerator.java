package com.clean.code.text;

public class TextGenerator {
	
	public String generateText(int number){
		
		if(number == 0){
			return "Zero";
		}
		if(number == 1){
			return "One";
		}
		if(number == 10){
			return "Ten";
		}
		return "";
		
	}

}
