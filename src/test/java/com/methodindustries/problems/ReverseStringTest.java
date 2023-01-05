package com.methodindustries.problems;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest 
{  
	
	@Test
	public  void  reverseTest() {
		ReverseString ReverseString = new ReverseString();
		assertEquals(ReverseString.reverse("hello"), "olleh");
		assertEquals(ReverseString.reverse("hi"), "ih");
		assertEquals(ReverseString.reverse("hello"), "illeh");


		
	}
}
