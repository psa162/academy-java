package com.bptn.course._19_junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorDemoTest {
	
	private CalculatorExample calculator;
	
	@BeforeEach
	public void setup() {
		calculator =new CalculatorExample();
	}
	
	@Test
	public void testAdd() {
		assertEquals(10, calculator.add(5,5),"5+5 should equal 10");
	}
	@Test
	public void testSubstract() {
		assertEquals(5, calculator.subtraction(10,5),"10-5 should equal 5");
}
}
