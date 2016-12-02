package com.clean.code;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class NumberToTextRepresentationConverterShould {
	
	@Test
	public void return_zero_text_when_input_number_is_0(){
		NumberToTextRepresentationConverter numberToTextConverter = new NumberToTextRepresentationConverter();
		assertEquals("Zero", numberToTextConverter.textualRepresentation(0));
	}

}
