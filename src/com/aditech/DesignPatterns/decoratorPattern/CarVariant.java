package com.aditech.DesignPatterns.decoratorPattern;

public class CarVariant implements Car{
	private Car car;
	
	public CarVariant(Car car) {
		this.car = car;
	}
	
	@Override
	public double cost() {
		return this.car.cost();
	}

}
