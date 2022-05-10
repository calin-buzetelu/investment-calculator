package com.org.service;

public class CalculatorService {

	/**
	 * Currently, the contribution happens at the end of the period
	 * FV = P*[(1 + r/n)^(n*t)]
	 * @param startAmount Represents the initial capital value
	 * @param contribution Represents how much we contribute in every period
	 * @param contributionRate The number of contributionRate within the year
	 * @param compoundPeriods The number of compounding contributionRate within the year
	 * @param time The length in years of our investment
	 * @param returnRate The forecasted return rate yoy
	 * @return the future value of the investment
	 */
	public double computeFutureValue(int startAmount, int contribution, int contributionRate, int compoundPeriods, int time, float returnRate){
		double futureValue = 0;
		double principal = startAmount + contribution * contributionRate;
		for (int i = 0; i < time; i++) {
			futureValue = principal * Math.pow((1 + returnRate / compoundPeriods), compoundPeriods);
			principal = futureValue + contribution * contributionRate;
		}
		return Math.round(futureValue);
	}
}
