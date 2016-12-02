package com.clean.code.enumeration;

public enum TextForNumberTillTenEnum {
	
	One(1), 
	Zero(0),
	Ten(10);
	
	private int number;

	TextForNumberTillTenEnum(int number){
		this.number = number;
	}

	/**
	 * Getter for number.
	 * @return int
	 */
	public int getNumber() {
		return number;
	}	
}
