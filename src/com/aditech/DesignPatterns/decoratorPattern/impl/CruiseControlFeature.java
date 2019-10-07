package com.aditech.DesignPatterns.decoratorPattern.impl;

import com.aditech.DesignPatterns.decoratorPattern.Car;
import com.aditech.DesignPatterns.decoratorPattern.CarVariant;

public class CruiseControlFeature extends CarVariant{

	public CruiseControlFeature(Car car) {
		super(car);
	}
	
	@Override
	public double cost() {
		System.out.println("You have added Cruise Control Feature");
		return super.cost() + 2000.00;
	}

}
