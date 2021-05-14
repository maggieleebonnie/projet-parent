package com.formation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.formation.back.Calculator;


public class TestCalculator {
	
	Calculator c = new Calculator();
	
	@Test
	public void testAdd() {
		
		Assertions.assertEquals(2, c.add(1, 1));
		
	}

	@Test
	public void testMultiply() {
		
		Assertions.assertEquals(15, c.multiply(3, 5));
		
	}
}
