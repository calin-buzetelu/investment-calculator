package com.org.entity;


import com.org.service.CalculatorService;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class DataEntry {

	@NotNull(message = "Please specify the start amount of your investment...")
	@Min(value = 0, message = "The minimum value has to be greater than 0...")
	private Integer startAmount;

	@NotNull(message = "Please specify the forecasted contribution for your investment...")
	private Integer contribution;

	@NotNull(message = "Please specify the contribution rate (in months) for your investment...")
	@Min(value = 0, message = "The contribution rate has to be a positive number")
	private Integer contributionRate;

	@NotNull(message = "Please specify the number of compounding periods within a year...")
	@Min(value = 0, message = "The number of compounding periods has to be a positive number")
	private Integer compoundPeriods;

	@NotNull(message = "Please specify the time period (in years) of your investment...")
	@Min(value = 0, message = "The number of years has to be a positive number")
	private Integer time;

	@NotNull(message = "Please specify the yearly expected return rate for your investment...")
	private Float returnRate;

	private CalculatorService calculatorService;

	public DataEntry() {
		calculatorService = new CalculatorService();
	}

	public Integer getStartAmount() {
		return startAmount;
	}

	public void setStartAmount(Integer startAmount) {
		this.startAmount = startAmount;
	}

	public Integer getContribution() {
		return contribution;
	}

	public void setContribution(Integer contribution) {
		this.contribution = contribution;
	}

	public Integer getContributionRate() {
		return contributionRate;
	}

	public void setContributionRate(Integer contributionRate) {
		this.contributionRate = contributionRate;
	}

	public Integer getCompoundPeriods() {
		return compoundPeriods;
	}

	public void setCompoundPeriods(Integer compoundPeriods) {
		this.compoundPeriods = compoundPeriods;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public Float getReturnRate() {
		return returnRate;
	}

	public void setReturnRate(Float returnRate) {
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
