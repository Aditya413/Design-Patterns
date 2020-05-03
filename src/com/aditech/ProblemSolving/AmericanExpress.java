package com.aditech.ProblemSolving;

public class AmericanExpress {

	public static void main(String args[]) {

	}

	private static int[] giveMeArr(int N) {

		int[] result = new int[N];

		if (N == 1) {
			result[0] = 0;
			return result;
		}

		int midElement = N / 2;

		if (N % 2 == 0) {
			int i = 0;
			while (i < N) {
				result[i] = midElement;
				result[i + 1] = -midElement;
				i += 2;
				midElement--;
			}
		} else {
			result[0] = 0;
			int i = 1;
			while (i < N) {
				result[i] = midElement;
				result[i + 1] = -midElement;
				i += 2;
				midElement--;
			}
		}

		return result;

	}
}
