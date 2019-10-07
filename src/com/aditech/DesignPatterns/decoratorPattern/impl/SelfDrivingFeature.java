package com.aditech.DesignPatterns.decoratorPattern.impl;

import com.aditech.DesignPatterns.decoratorPattern.Car;
import com.aditech.DesignPatterns.decoratorPattern.CarVariant;

public class SelfDrivingFeature extends CarVariant{
	public SelfDrivingFeature(Car car) {
		super(car);
	}
	
	@Override
	public double cost() {
		System.out.println("You have added Self Driving Feature");
		return super.cost() + 7000.00;
	}
}
