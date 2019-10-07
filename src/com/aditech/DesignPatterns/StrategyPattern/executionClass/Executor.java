package com.aditech.DesignPatterns.StrategyPattern.executionClass;

import com.aditech.DesignPatterns.StrategyPattern.controller.InsurancePlan;
import com.aditech.DesignPatterns.StrategyPattern.model.InsuranceCategory;
import com.aditech.DesignPatterns.StrategyPattern.model.MedicalInsurance;
import com.aditech.DesignPatterns.StrategyPattern.model.PropertyInsurance;
import com.aditech.DesignPatterns.StrategyPattern.model.VehicleInsurance;

public class Executor {

	public static void main(String[] args) {
		InsurancePlan insurancePlan = new InsurancePlan();
		// Purchased for different Insurance Category
		InsuranceCategory purchaseMedicalInsurance = new InsuranceCategory("John Wick", 5000, InsuranceCategory.InsuranceType.MEDICAL);
		InsuranceCategory vehicleMedicalInsurance = new InsuranceCategory("John Wick", 7000, InsuranceCategory.InsuranceType.VEHICLE);
		InsuranceCategory propertyMedicalInsurance = new InsuranceCategory("John Wick", 10000, InsuranceCategory.InsuranceType.PROPERTY);
		// Adding all categories into a common plan
		insurancePlan.addInsurancePlan(purchaseMedicalInsurance);
		insurancePlan.addInsurancePlan(vehicleMedicalInsurance);
		insurancePlan.addInsurancePlan(propertyMedicalInsurance);
		
		// As we have purchased all the plan then we are going to calculate premium for all
		for(InsuranceCategory category : insurancePlan.getInsurancePlanList()) {
			if(category.getInsuranceType().equals(InsuranceCategory.InsuranceType.MEDICAL)){
				MedicalInsurance medicalInsurance = new MedicalInsurance(category.getInsurerName(), 35);
				insurancePlan.pay(medicalInsurance);
			} else if(category.getInsuranceType().equals(InsuranceCategory.InsuranceType.VEHICLE)){
				VehicleInsurance vehicleInsurance = new VehicleInsurance("DL 5S AF 6925", category.getInsurerName(), Boolean.TRUE);
				insurancePlan.pay(vehicleInsurance);
			} else {
				PropertyInsurance propertyInsurance = new PropertyInsurance("GHAZIABAD", category.getInsurerName(), 7);
				insurancePlan.pay(propertyInsurance);
			}
		}
	}

}
