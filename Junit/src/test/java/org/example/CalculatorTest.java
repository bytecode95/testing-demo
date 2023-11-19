package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void addTest(){
        Calculator cal = new Calculator();
        assertEquals(5, cal.add(3,2));
        //assertTrue(cal.add(2,2)==4);
        //assertNotEquals(3, cal.add(2,2));

        //negative numbers
        assertEquals(-1,  cal.add(2,-3));

        //Zero
        assertEquals(2, cal.add(2,0));

    }

}