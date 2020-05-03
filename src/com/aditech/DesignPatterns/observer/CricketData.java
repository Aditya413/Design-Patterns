package com.aditech.DesignPatterns.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class CricketData implements Subject {

	int runs;
	int wickets;
	float overs;
	ArrayList<Observer> observerList;

	public CricketData() {
		this.observerList = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {

		observerList.add(o);
	}

	@Override
	public void unregisterObserver(Observer o) {

		observerList.remove(observerList.indexOf(o));
	}

	@Override
	public void notifyObserver() {

		for (Iterator<Observer> it = observerList.iterator(); it.hasNext();) {
			Observer o = it.next();
			o.update(runs, wickets, overs);
		}
	}

	private int getLatestRuns() {

		return 90;
	}

	// get latest wickets from stadium
	private int getLatestWickets() {

		// return 2 for simplicity
		return 2;
	}

	// get latest overs from stadium
	private float getLatestOvers() {

		// return 90 for simplicity
		return (float) 10.2;
	}

	public void dataChanged() {

		runs = getLatestRuns();
		wickets = getLatestWickets();
		overs = getLatestOvers();

		notifyObserver();
	}

}
