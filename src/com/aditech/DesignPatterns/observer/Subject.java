package com.aditech.DesignPatterns.observer;

public interface Subject {

	public void registerObserver(Observer o);
	public void unregisterObserver(Observer o);
	public void notifyObserver();
}
