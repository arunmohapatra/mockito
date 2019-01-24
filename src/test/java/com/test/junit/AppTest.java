package com.test.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import org.junit.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test(expected = RuntimeException.class)
    public void shouldAnswerWithTrue()
    {
        List<String> list = mock(List.class);
        when(list.get(2)).thenReturn("Arun");
        when(list.get(3)).thenReturn("Mohapatra");
        assertEquals("Arun",list.get(2));
        assertEquals("Mohapatra",list.get(3));
        throw new RuntimeException("hi");





    }

    @Test
    public void display() {



    }
}
