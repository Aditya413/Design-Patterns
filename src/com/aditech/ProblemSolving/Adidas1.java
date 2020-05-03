package com.aditech.ProblemSolving;

import java.util.Scanner;

public class Adidas1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numOfChar = sc.nextInt();
		String[] strArr = new String[numOfChar];
		strArr = sc.next().split(" ");
		sc.close();

		System.out.println(String.valueOf(strArr));

	}

}
