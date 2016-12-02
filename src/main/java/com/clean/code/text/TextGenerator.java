package com.clean.code.text;

import com.clean.code.enumeration.TextForNumberTillTenEnum;

public class TextGenerator {
	
	public String generateText(int number){
		for(TextForNumberTillTenEnum textEnum : TextForNumberTillTenEnum.values()){
			if(number == textEnum.getNumber()){
				return textEnum.name();
			}
		}
		return "";		
	}
}
