package com.aditech.ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToyProblem {

	public static void main(String[] args) {

		int numToys = 5;
		int topToys = 2;
		List<String> toys = Arrays.asList("anacell", "betacelluar",
				"cetracular", "deltacellular", "eurocell");
		int numQuotes = 5;
		List<String> quotes = Arrays.asList(
				"i love anacell best service provider anacell",
				"betacelluar has great service",
				"deltacellular provies much more better service than betacelluar",
				"cetracular is worst than eurocell",
				"betacelluar is better than deltacellular");
		System.out.println(
				popularNToys(numToys, topToys, toys, numQuotes, quotes));
	}

	public static ArrayList<String> popularNToys(int numToys, int topToys,
			List<String> toys, int numQuotes, List<String> quotes) {

		ArrayList<String> topDemand = new ArrayList<>();
		if (numToys > 0) {
			Map<String, Integer> toysCount = new HashMap<>();
			for (int i = 0; i < numToys; i++) {
				int toyCount = 0;
				for (int j = 0; j < numQuotes; j++) {
					String lowerQuotes = quotes.get(j).toLowerCase();
					toyCount = toyCount
							+ countMyWord(lowerQuotes.split(" "), toys.get(i));
				}
				toysCount.put(toys.get(i), toyCount);
			}

			if (topToys > numToys) {
				return (ArrayList<String>) toysCount.keySet().stream()
						.collect(Collectors.toList());
			} else {
				for (int i = 0; i < topToys; i++) {
					String key = toysCount.entrySet().stream()
							.max(Map.Entry.comparingByValue()).get().getKey();
					toysCount.entrySet().removeIf(
							entry -> key.equalsIgnoreCase(entry.getKey()));
					topDemand.add(key);
				}
			}

		}

		return topDemand;
	}

	private static int countMyWord(String arr[], String word) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (word.equals(arr[i])) {
				count++;
			}
		}

		return count;
	}

}
