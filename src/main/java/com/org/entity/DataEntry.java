package com.org.entity;


import com.org.service.CalculatorService;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class DataEntry {

	@NotNull(message = "You have to specify the start amount of your investment...")
	@Min(value = 0, message = "The minimum value has to be greater than 0...")
	private Integer startAmount;
	@NotNull(message = "not allowed")
	private Integer contribution;
	@NotNull(message = "not allowed")
	private Integer contributionRate;
	@NotNull(message = "not allowed")
	private Integer compoundPeriods;
	@NotNull(message = "not allowed")
	private Integer time;
	@NotNull(message = "not allowed")
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
