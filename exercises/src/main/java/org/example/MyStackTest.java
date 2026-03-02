package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import java.util.EmptyStackException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyStackTest extends MyStack{
    MyStack<Integer> stack;
    @BeforeEach
    public void setUP(){
        stack = new MyStack<>();
    }

    @Test
    public void testSizeOfEmptyStack(){
        assertEquals(0, stack.size());
    }

    @Test
    public void testAddOneElement(){
        assertEquals(0, stack.size());
        stack.add(20);
        assertEquals(1, stack.size());
    }

    @Test
    public void testAddManyElements(){
        for(int i = 0; i < 10_000; i++){
            stack.add(i);
        }
        assertEquals(10_000, stack.size());
    }

    @Test
    public void testPopEmptyStack(){
        assertEquals(0, stack.size());
        assertThrows(EmptyStackException.class, () -> stack.pop());
    }

    @Test
    public void testAddMaxValueWithMaxSize(){
        for(int i = 0; i < Integer.MAX_VALUE; i++){
            stack.add(Integer.MAX_VALUE);
        }
        assertEquals(Integer.MAX_VALUE, stack.size());
    }

    @Test
    public void testPopReturnsLastElement(){
        stack.add(12);
        stack.add(17);
        int size = stack.size();
        assertEquals(17, stack.pop().intValue());
        assertEquals(1, stack.size());
    }

    @Test
    public void testAddAll(){
        stack.addAll(List.of(1, 2, 3));
        assertEquals(3, stack.size());
    }
}
