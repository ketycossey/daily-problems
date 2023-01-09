package com.methodindustries.problems;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanConverterTest {
	
	@Test
	public void SymbolShouldReturnCorrectNumber() {
		RomanConverter RomanConverter = new RomanConverter();
		assertEquals(RomanConverter.romanToInt("CMXCIX"), 999 );
		assertEquals(RomanConverter.romanToInt("CDXLIV"), 444 );
		assertEquals(RomanConverter.romanToInt("MDCLXVI"), 1666 );
		assertEquals(RomanConverter.romanToInt("LX"), 60 );


		
		
	}

}
