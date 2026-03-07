package org.example;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private final FizzBuzz fizzbuzz = new FizzBuzz();

    @Test
    public void FizzBuzzTest(){
        assertEquals("FizzBuzz", fizzbuzz.evaluate(15));
        assertEquals("FizzBuzz", fizzbuzz.evaluate(30));
        assertEquals("FizzBuzz", fizzbuzz.evaluate(150));
    }

    @Test
    public void FizzBuzzTestContains3And5(){
        assertEquals("FizzBuzz", fizzbuzz.evaluate(15));
        assertEquals("FizzBuzz", fizzbuzz.evaluate(5555553));
    }

    @Test
    public void FizzBuzzTestMultipleOf3(){
        assertEquals("Fizz", fizzbuzz.evaluate(3));
        assertEquals("Fizz", fizzbuzz.evaluate(9));
    }

    @Test
    public void FizzBuzzTestContains3(){
        assertEquals("Fizz", fizzbuzz.evaluate(37));
        assertEquals("Fizz", fizzbuzz.evaluate(673));
        assertEquals("Fizz", fizzbuzz.evaluate(932));
        assertEquals("Fizz", fizzbuzz.evaluate(33331));
        assertEquals("Fizz", fizzbuzz.evaluate(1231));
    }

    @Test
    public void FizzBuzzTestMultipleOf5(){
        assertEquals("Buzz", fizzbuzz.evaluate(5));
        assertEquals("Buzz", fizzbuzz.evaluate(551));
        assertEquals("Buzz", fizzbuzz.evaluate(2225));
        assertEquals("Buzz", fizzbuzz.evaluate(888577));
    }

    @Test
    public void testOther(){
        assertEquals("7", fizzbuzz.evaluate(7));
        assertEquals("74", fizzbuzz.evaluate(74));
    }
}
