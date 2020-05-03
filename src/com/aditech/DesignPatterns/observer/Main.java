package com.aditech.DesignPatterns.observer;

public class Main {

	public static void main(String[] args) {

		AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
		CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();

		// pass the displays to Cricket data
		CricketData cricketData = new CricketData();

		// register display elements
		cricketData.registerObserver(averageScoreDisplay);
		cricketData.registerObserver(currentScoreDisplay);

		cricketData.dataChanged();

		cricketData.unregisterObserver(averageScoreDisplay);

		cricketData.dataChanged();

	}

}
