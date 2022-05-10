package com.org.entity;


import com.org.service.CalculatorService;

public class DataEntry {

	private int startAmount;
	private int contribution;
	private int contributionRate;
	private int compoundPeriods;
	private int time;
	private float returnRate;

	private CalculatorService calculatorService;

	public DataEntry() {
		calculatorService = new CalculatorService();
	}

	public int getStartAmount() {
		return startAmount;
	}

	public void setStartAmount(int startAmount) {
		this.startAmount = startAmount;
	}

	public int getContribution() {
		return contribution;
	}

	public void setContribution(int contribution) {
		this.contribution = contribution;
	}

	public int getContributionRate() {
		return contributionRate;
	}

	public void setContributionRate(int contributionRate) {
		this.contributionRate = contributionRate;
	}

	public int getCompoundPeriods() {
		return compoundPeriods;
	}

	public void setCompoundPeriods(int compoundPeriods) {
		this.compoundPeriods = compoundPeriods;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public float getReturnRate() {
		return returnRate;
	}

	public void setReturnRate(float returnRate) {
		this.returnRate = returnRate;
	}

	public double computeFutureValue(){
		return calculatorService.computeFutureValue(startAmount, contribution, contributionRate, compoundPeriods, time, returnRate);
	}

	@Override
	public String toString() {
		return "DataEntry{" +
				"startAmount=" + startAmount +
				", contribution=" + contribution +
				", periods=" + contributionRate +
				", time=" + time +
				", returnRate=" + returnRate +
				'}';
	}
}
