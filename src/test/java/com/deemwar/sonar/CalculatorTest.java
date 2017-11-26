package com.deemwar.sonar;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.deemwar.sonar.Calculator;

public class CalculatorTest {

	
	Calculator calculator;
	
	@Before
	public void setup(){
		calculator= new Calculator();
		
	}
	
	 @Test public void testAppCanPrintName() {
	        
	        assertNotNull("Calculator", calculator.printAppName());
	    }
	 
	@Test
	public void testAdd() {
		assertEquals(5, calculator.add(2, 3));
		assertEquals(10, calculator.add(7, 3));
	}

	@Test
	public void testMultiply() {
		assertEquals(12, calculator.multiply(4, 3));
		assertEquals(15, calculator.multiply(5, 3));
	}

}
