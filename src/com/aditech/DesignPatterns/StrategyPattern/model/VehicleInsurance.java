package com.aditech.DesignPatterns.StrategyPattern.model;

import com.aditech.DesignPatterns.StrategyPattern.controller.Insurance;

public class VehicleInsurance implements Insurance {
	private String vehicleNumber;
	private String ownerName;
	private boolean isThirdParty;
	public VehicleInsurance(String vehicleNumber, String ownerName, boolean isThirdParty) {
		this.vehicleNumber = vehicleNumber;
		this.ownerName = ownerName;
		this.isThirdParty = isThirdParty;
	}
	
	@Override
	public void calcalulatePremium(long amount) {
		System.out.println("Vehicle Insurance purchased in name of Mr/Mrs "+this.ownerName);
		System.out.println("Vehicle number "+this.vehicleNumber);
		System.out.println("Is it Third Party Insurance? "+this.isThirdParty);
		System.out.println("Premium amount paid "+amount);
	}
}
