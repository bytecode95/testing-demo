package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeTest {
    @Test
    void testGrade(){
        Grade gr = new Grade();
        assertEquals("Grade A", gr.checkGrade(75.50));
        assertEquals("Grade B", gr.checkGrade(70.00));
        assertEquals("Grade C", gr.checkGrade(55.50));
        assertEquals("Grade S", gr.checkGrade(42.00));
        assertEquals("Grade W", gr.checkGrade(35.00));
        assertEquals("Please add valid mark", gr.checkGrade(-5));
    }
}