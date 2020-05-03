package com.aditech.ProblemSolving;

import java.util.Scanner;

public class StockMarket {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numberOfTrans = sc.nextInt();
		int minProfit = sc.nextInt();
		int maxProfit = sc.nextInt();

		if (numberOfTrans > 1 && numberOfTrans < 1000000000) {
			if ((minProfit > 1 && minProfit < 1000000000)
					&& (maxProfit > 1 && maxProfit < 1000000000)) {
				System.out.println(calCulatePossibilities(numberOfTrans,
						minProfit, maxProfit));
			}
		}
	}

	private static int calCulatePossibilities(int trans, int minProfit,
			int maxProfit) {

		int minProfitValueForOneTrans = 0;
		int maxProfitValueForOneTrans = 0;

		for (int i = 0; i < trans; i++) {
			minProfitValueForOneTrans += minProfit;
		}

		for (int i = 0; i < trans; i++) {
			maxProfitValueForOneTrans += maxProfit;
		}

		return (maxProfitValueForOneTrans - minProfitValueForOneTrans) - trans;
	}
}
