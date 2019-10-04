package com.aditech.DesignPatterns.StrategyPattern.controller;

import java.util.ArrayList;
import java.util.List;

import com.aditech.DesignPatterns.StrategyPattern.model.InsuranceCategory;

public class InsurancePlan {
	private List<InsuranceCategory> insurancePlanList;
	
	public InsurancePlan() {
		this.insurancePlanList = new ArrayList<>();
	}

	public void addInsurancePlan(InsuranceCategory insuranceCategory) {
		insurancePlanList.add(insuranceCategory);
	}

	public void removeInsurancePlan(InsuranceCategory insuranceCategory) {
		insurancePlanList.remove(insuranceCategory);
	}
	
	public long calCulateTotal() {
		return insurancePlanList.stream().mapToLong(plan -> plan.getAmount()).sum();
	}
	
	public void pay(Insurance insuranceStrategy){
		long amount = calCulateTotal();
		insuranceStrategy.calcalulatePremium(amount);
	}
}
