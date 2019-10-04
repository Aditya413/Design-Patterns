package com.aditech.DesignPatterns.StrategyPattern.model;

public class InsuranceCategory {
	private String InsurerName;
	private enum InsuranceType{MEDICAL, VEHICLE, PROPERTY};
	private long amount;
	private InsuranceType insuranceType;
	
	public InsuranceCategory(String insurerName, long amount, InsuranceType insuranceType) {
		InsurerName = insurerName;
		this.amount = amount;
		this.insuranceType = insuranceType;
	}
	public String getInsurerName() {
		return InsurerName;
	}
	public void setInsurerName(String insurerName) {
		InsurerName = insurerName;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public InsuranceType getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(InsuranceType insuranceType) {
		this.insuranceType = insuranceType;
	}
}
