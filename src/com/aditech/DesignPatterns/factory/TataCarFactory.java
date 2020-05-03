package com.aditech.DesignPatterns.factory;

import com.aditech.DesignPatterns.factory.model.Car;

public abstract class TataCarFactory {
	public Car startManufacturing(String carName){
		Car car;
		car = configuration(carName);
		
		car.getName();
		car.getType();
		car.getContinent();
		
		return car;
	}
	
	abstract public Car configuration(String carName);
}
