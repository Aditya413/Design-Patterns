package com.aditech.ProblemSolving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GroupString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numberOfString = sc.nextInt();
		Map<Integer, String> strMap = new HashMap<>();

		for (int i = 0; i < numberOfString; i++) {
			String input = sc.next();
			strMap.put(i + 1, input);
		}

		int numberOfQuestion = sc.nextInt();

		for (int i = 1; i <= numberOfQuestion; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int posOfcharacter = sc.nextInt();
			System.out.println(concatenateString(x, y, posOfcharacter, strMap));
		}
	}

	private static char concatenateString(int x, int y, int pos,
			Map<Integer, String> arr) {

		StringBuilder sb = new StringBuilder();

		for (int i = x; i <= y; i++) {
			sb.append(arr.get(i));
		}

		char[] tempArray = sb.toString().toCharArray();

		Arrays.sort(tempArray);

		return tempArray[pos - 1];
	}

}
