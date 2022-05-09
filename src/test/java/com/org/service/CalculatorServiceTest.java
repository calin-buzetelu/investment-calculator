package com.org.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorServiceTest {

	CalculatorService calculatorService = new CalculatorService();

	/**
	 * Test the computeFutureValue method with a start amount of 0, contribution of 1000 every period,
	 * a number of periods of 12, with a compound rate of 1 per year, a timespan of 1 year, and a return rate of 10%.
	 */
	@Test
	public void computeFutureValueTest1(){
		double expectedValue = 13200;
		double actualValue = calculatorService.computeFutureValue(0, 1000, 12, 1,1, 0.1f);
		assertEquals(expectedValue, actualValue);
	}

	/**
	 * Test the computeFutureValue method with a start amount of 0, contribution of 1000 every period,
	 * a number of periods of 12,  with a compound rate of 1 per year, a timespan of 2 years, and a return rate of 10%.
	 */
	@Test
	public void computeFutureValueTest2(){
		double expectedValue = 27720;
		double actualValue = calculatorService.computeFutureValue(0, 1000, 12, 1,2, 0.1f);
		assertEquals(expectedValue, actualValue);
	}
}
