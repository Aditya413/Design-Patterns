package com.aditech.DesignPatterns.decoratorPattern.impl;

import com.aditech.DesignPatterns.decoratorPattern.Car;

public class Launch {

	public static void main(String[] args) {
		Car basicModalCar = new BasicModelCar("Tesla");
		System.out.println("At the cost of : "+ basicModalCar.cost());
		
		// Adding new features
		
		// Adding Cruise control to basic modal
		CruiseControlFeature cruiseControlFeature = new CruiseControlFeature(basicModalCar);
		System.out.println("now total cost is : "+ cruiseControlFeature.cost());
		
		// Want to decorate more? adding self driving feature and cruise control to basic modal
		SelfDrivingFeature selfDrivingFeature = new SelfDrivingFeature(cruiseControlFeature);
		System.out.println("now total cost is : "+ selfDrivingFeature.cost());
		
		// Want to decorate more? adding AI, self driving feature and cruise control to basic modal
		AI_EnabledFeature AI_EnabledFeature = new AI_EnabledFeature(selfDrivingFeature);
		System.out.println("now total cost is : "+ AI_EnabledFeature.cost());
	}

}
