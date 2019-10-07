package com.aditech.DesignPatterns.decoratorPattern.impl;

import com.aditech.DesignPatterns.decoratorPattern.Car;

public class BasicModelCar implements Car{
	private double cost = 12000.00;
	
	public BasicModelCar(String carName) {
		System.out.println("You want to Purchased a basic model of " + carName);
	}

	@Override
	public double cost() {
		return cost;
	}

}
