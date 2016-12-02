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
	
	@Test
	public void return_one_text_when_input_number_is_1(){
		NumberToTextRepresentationConverter numberToTextConverter = new NumberToTextRepresentationConverter();
		assertEquals("One", numberToTextConverter.textualRepresentation(1));
	}
	
	@Test
	public void return_ten_text_when_input_number_is_10(){
		NumberToTextRepresentationConverter numberToTextConverter = new NumberToTextRepresentationConverter();
		assertEquals("Ten", numberToTextConverter.textualRepresentation(10));
	}
	
	@Test
	public void return_twenty_text_when_input_number_is_20(){
		NumberToTextRepresentationConverter numberToTextConverter = new NumberToTextRepresentationConverter();
		assertEquals("Twenty", numberToTextConverter.textualRepresentation(20));
	}
	
	@Test
	public void return_twentyone_text_when_input_number_is_21(){
		NumberToTextRepresentationConverter numberToTextConverter = new NumberToTextRepresentationConverter();
		assertEquals("Twenty One", numberToTextConverter.textualRepresentation(21));
	}
	
	@Test
	public void return_hundred_thirty_five_text_when_input_number_is_135(){
		NumberToTextRepresentationConverter numberToTextConverter = new NumberToTextRepresentationConverter();
		assertEquals("One Hundred Thirty Five", numberToTextConverter.textualRepresentation(135));
	}
	
	@Test
	public void return_three_thousand_six_hundred_eighty_nine_text_when_input_number_is_3689(){
		NumberToTextRepresentationConverter numberToTextConverter = new NumberToTextRepresentationConverter();
		assertEquals("Three Thousand Six Hundred Eighty Nine", numberToTextConverter.textualRepresentation(3689));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void throw_illegal_argument_exceptiont_when_input_number_is_greater_than_4_digits(){
		NumberToTextRepresentationConverter numberToTextConverter = new NumberToTextRepresentationConverter();
		numberToTextConverter.textualRepresentation(10000);
	}
	
	@Test
	public void return_nine_thousand_nine_hundred_ninety_nine_text_when_input_number_is_9999(){
		NumberToTextRepresentationConverter numberToTextConverter = new NumberToTextRepresentationConverter();
		assertEquals("Nine Thousand Nine Hundred Ninety Nine", numberToTextConverter.textualRepresentation(9999));
	}
	
	@Test
	public void return_eleven_text_when_input_number_is_11(){
		NumberToTextRepresentationConverter numberToTextConverter = new NumberToTextRepresentationConverter();
		assertEquals("Eleven", numberToTextConverter.textualRepresentation(11));
	}
}
