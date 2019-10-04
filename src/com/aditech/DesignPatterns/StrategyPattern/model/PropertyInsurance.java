package com.aditech.DesignPatterns.StrategyPattern.model;

import com.aditech.DesignPatterns.StrategyPattern.controller.Insurance;

public class PropertyInsurance implements Insurance {
	private String propertyAddress;
	private String ownerName;
	private int propertyAge;
	public PropertyInsurance(String propertyAddress, String ownerName, int propertyAge) {
		this.propertyAddress = propertyAddress;
		this.ownerName = ownerName;
		this.propertyAge = propertyAge;
	}
	
	@Override
	public void calcalulatePremium(long amount) {
		System.out.println("Property Insurance purchased in name of Mr/Mrs "+this.ownerName);
		System.out.println("Property address "+this.propertyAddress);
		System.out.println("Property existed from years "+this.propertyAge);
		System.out.println("Premium amount paid "+amount);
	}
}
