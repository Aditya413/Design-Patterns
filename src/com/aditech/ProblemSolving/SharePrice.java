package com.aditech.ProblemSolving;

public class SharePrice {

	public static void main(String[] args) {
		/*
		 * Scanner s = new Scanner(System.in);
		 * System.out.println("Enter the length of the array:");
		 * int length = s.nextInt();
		 * int[] myArray = new int[]{7, 1, 5, 3, 6, 4};
		 * System.out.println("Enter the elements of the array:");
		 * 
		 * for (int i = 0; i < length; i++) {
		 * myArray[i] = s.nextInt();
		 * }
		 */

		int[] myArray = new int[]{2, 7, 9, 3, 1};
		rob(myArray);
	}

	public static int rob(int[] nums) {

		int evenMoney = 0;
		int oddMoney = 0;
		for (int i = 0; i < nums.length; i += 2) {
			evenMoney += nums[i];
		}

		for (int i = 1; i < nums.length; i += 2) {
			oddMoney += nums[i];
		}

		return Math.max(evenMoney, oddMoney);
	}

}
