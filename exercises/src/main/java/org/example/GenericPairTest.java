package org.example;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GenericPairTest {
    @Test
    public void testEquals(){
        GenericPair<Integer, String> pair1 = new GenericPair<>(1, "a");
        GenericPair<Integer, String> pair2 = new GenericPair<>(1, "a");
        assertTrue(pair1.equals(pair2));
        assertTrue(pair2.equals(pair1));
    }

    @Test
    public void testSetAndEquals(){
        GenericPair<Character, String> pair1 = new GenericPair();
        pair1.setKey('a');
        pair1.setValue("a");
        GenericPair<Character, String> pair2 = new GenericPair('a', "b");
        assertFalse(pair1.equals(pair2));
        assertFalse(pair2.equals(pair1));
    }

    @Test
    public void testHashCode(){
        GenericPair<Character, String> pair1 = new GenericPair();
        pair1.setKey('a');
        pair1.setValue("a");
        GenericPair<Character, String> pair2 = new GenericPair('a', "b");
        assertNotEquals(pair1.hashCode(), pair2.hashCode());
    }

    @Test
    public void testToString(){
        GenericPair<Character, String> pair1 = new GenericPair('a', "b");
        System.out.println(pair1);
    }

}
