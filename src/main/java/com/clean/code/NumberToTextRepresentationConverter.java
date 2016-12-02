package com.clean.code;


public class NumberToTextRepresentationConverter {
	
	private NumberToTextualRepresentationService numberToTextualRepresentationService;
	
	public NumberToTextRepresentationConverter(){
		this.numberToTextualRepresentationService = new NumberToTextualRepresentationService();
	}

	public String textualRepresentation(int number) {
		return numberToTextualRepresentationService.generateTextualRepresentation(number);
	}
}
