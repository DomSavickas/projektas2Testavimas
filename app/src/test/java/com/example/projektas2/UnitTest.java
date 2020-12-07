package com.example.projektas2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UnitTest {
    @Test(expected = NullPointerException.class)
    public void Given_NullString_When_CharCounterIsCalled_Then_NullPointerExceptionIsThrown(){
       CharWordCounter.CharCounter(null);
    }
    @Test(expected = NullPointerException.class)
    public void Given_NullString_When_WordCounterIsCalled_Then_NullPointerExceptionIsThrown(){
        CharWordCounter.WordCounter(null);
    }
    @Test
    public void Given_SixCharString_When_CharCounterIsCalled_Then_ReturnSix(){
        final String givenString = "testas";

        final int expectedResult = 6;
        final int actualResult = CharWordCounter.CharCounter(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void Given_String_When_WordCounterIsCalled_Then_ReturnThree(){
        final String givenString = "testas testas testas";

        final int expectedResult = 3;
        final int actualResult = CharWordCounter.WordCounter(givenString);

        assertEquals(expectedResult, actualResult);
    }
}