package com.org.service;

public class CalculatorService {

	/**
	 * Currently, the contribution happens at the end of the period
	 *
	 * @param startAmount Represents the initial capital value
	 * @param contribution Represents how much we contribute in every period
	 * @param periods The number of periods within the year
	 * @param time The length in years of our investment
	 * @param returnRate The forecasted return rate yoy
	 * @return the future value of the investment
	 */
	public double computeFutureValue(int startAmount, int contribution, int periods, int compoundPeriods, int time, float returnRate){
		double futureValue = 0;
		double principal = startAmount + contribution * periods;
		for (int i = 0; i < time; i++) {
			futureValue = principal * Math.pow((1 + returnRate / compoundPeriods), compoundPeriods);
			principal = futureValue + contribution * periods;
		}
		return Math.round(futureValue);
	}
}
