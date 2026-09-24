package com.example.maven_github_demo_108;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */

public class grade_CalcTest {
	 @Test
	    void testTotal() {
	        assertEquals(225,
	            grade_Calc.calculateTotal(75, 68, 82));
	    }

	    @Test
	    void testAverage() {
	        assertEquals(75.0,
	        		grade_Calc.calculateAverage(75, 68, 82));
	    }

	    @Test
	    void testPass() {
	        assertTrue(grade_Calc.isPass(75.0));
	    }

	    @Test
	    void testFail() {
	        assertFalse(grade_Calc.isPass(35.0));
	    }


}
