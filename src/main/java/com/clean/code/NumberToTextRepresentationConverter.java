package com.clean.code;

/**
 * Main class to retrieve Textual Representation of a number.
 * The service can support this upto 4 digits.
 *  
 * @author hputhr
 *
 */
public class NumberToTextRepresentationConverter {
	
	/**
	 * NumberToTextualRepresentationService 
	 */
	private NumberToTextualRepresentationService numberToTextualRepresentationService;
	
	/**
	 * Constructor
	 */
	public NumberToTextRepresentationConverter(){
		this.numberToTextualRepresentationService = new NumberToTextualRepresentationService();
	}

	/**
	 * Method to fetch the Textual Representation of the input number.
	 * 
	 * @param int
	 * @return String
	 */
	public String textualRepresentation(int number) {
		return numberToTextualRepresentationService.generateTextualRepresentation(number);
	}
}
