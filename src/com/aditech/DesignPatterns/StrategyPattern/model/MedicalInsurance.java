package com.aditech.DesignPatterns.StrategyPattern.model;

import com.aditech.DesignPatterns.StrategyPattern.controller.Insurance;

public class MedicalInsurance implements Insurance {
	private String name;
	private int age;
	
	public MedicalInsurance(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public void calcalulatePremium(long amount) {
		System.out.println("Medical Insurance brought for Mr/Mrs "+this.name);
		System.out.println("Age "+this.age);
		System.out.println("Premium amount paid "+amount);
	}
	
}
