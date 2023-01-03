package com.methodindustries.problems;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class FizzBuzzTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    

    @Test
    public void multipleOfThreeShouldReturnFizz()
    {
    assertEquals(FizzBuzz.fizz(3), true );
    assertEquals(FizzBuzz.fizz(2), false );
    assertEquals(FizzBuzz.fizz(9), true );

    }
    @Test
    public void multipleOfFiveShouldReturnBuzz()
    {
    assertEquals(FizzBuzz.buzz(5), true );
    assertEquals(FizzBuzz.buzz(2), false );
    assertEquals(FizzBuzz.buzz(10), true );

    }
    @Test
    public void calculateShouldReturnCorrectString()
    {
    FizzBuzz FizzBuzz= new FizzBuzz();
    assertEquals(FizzBuzz.calculate(0), "FizzBuzz");
    assertEquals(FizzBuzz.calculate(5), "Buzz");
    assertEquals(FizzBuzz.calculate(15), "FizzBuzz");
    assertEquals(FizzBuzz.calculate(9), "Fizz");
    

    }
}
