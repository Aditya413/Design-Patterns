package com.aditech.DesignPatterns.factory.model;

public class Car {
	private String name;
	private String type;
	private String continent;
	
	public Car(String name, String type, String continent) {
		this.name = name;
		this.type = type;
		this.continent = continent;
	}
	
	public void getName() {
		System.out.println("Manufacturing car.. " + name);
	}
	public void getType() {
		System.out.println("of type.. " + type);
	}
	public void getContinent() {
		System.out.println("for continent.. " + continent);
	}
	 
}
