package com.aditech.ProblemSolving;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Mismatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numberOfTest = sc.nextInt();
		Map<Integer, String> strMap = new HashMap<>();

		for (int i = 0; i < numberOfTest; i++) {
			int lengthOfStr = sc.nextInt();
			String str = sc.next();
			strMap.put(lengthOfStr, str);
		}

		sc.close();

		for (Entry<Integer, String> entry : strMap.entrySet()) {
			System.out.println(reverseMe(entry.getValue()));
		}
	}

	private static int reverseMe(String input) {

		StringBuffer strBuff = new StringBuffer(input);
		String reverse = strBuff.reverse().toString();

		char[] reverseArr = reverse.toCharArray();
		char[] inpurArr = input.toCharArray();

		int count = 0;

		for (int i = 0; i < inpurArr.length; i++) {
			if (reverseArr[i] != inpurArr[i]) {
				count = count + 1;
			}
		}

		return count;
	}

}
