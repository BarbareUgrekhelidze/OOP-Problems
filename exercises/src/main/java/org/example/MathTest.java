package org.example;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class MathTest extends Math{

    @Test
    public void testAddSmallPositiveNumbers(){
        assertEquals(2, add(1, 1));
        assertEquals(7, add(3, 4));
        assertEquals(20, add(15, 5));
    }

    @Test
    public void testAddSmallNegativeNumbers(){
        assertEquals(-7, add(-3, -4));
        assertEquals(-2, add(-1, -1));
    }

    @Test
    public void testAddSmallPositiveAndNegativeNumbers(){
        assertEquals(0, add(1, -1));
        assertEquals(-1, add(3, -4));
    }

    @Test
    public void testAddBigPositiveNumbers(){
        assertEquals(100_000, add(50_000, 50_000));
    }

    @Test
    public void testAddMaxValues(){
        assertEquals(1, add(-Integer.MAX_VALUE, Integer.MIN_VALUE));
    }

    @Test
    public void testAbsBigPositiveNumber(){
        assertEquals(100_000_000, abs(100_000_000));
        assertEquals(555555, abs(555555));
    }

    @Test
    public void testAbsMinValue(){
        assertEquals(Integer.MAX_VALUE, abs(Integer.MIN_VALUE));
    }
}
