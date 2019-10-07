package com.aditech.DesignPatterns.decoratorPattern.impl;

import com.aditech.DesignPatterns.decoratorPattern.Car;
import com.aditech.DesignPatterns.decoratorPattern.CarVariant;

public class AI_EnabledFeature extends CarVariant{

	public AI_EnabledFeature(Car car) {
		super(car);
	}
	
	@Override
	public double cost() {
		System.out.println("You have added AI Enabling Feature");
		return super.cost() + 8000.00;
	}
}
