package com.clean.code;

import java.util.ArrayList;
import java.util.List;

public class DecimalValueFinder {
	
	public List<Integer> retrieveDecimalValues(int number){
		List<Integer> decimalValues = new ArrayList<>();
		int valueAtTensPlace = number / 10;
		int valueAtUnitsPlace = number % 10;		
		decimalValues.add(valueAtUnitsPlace);
		decimalValues.add(valueAtTensPlace);
		return decimalValues;
	}
}
