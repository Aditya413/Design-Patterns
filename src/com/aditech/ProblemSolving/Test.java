package com.aditech.ProblemSolving;

public class Test {

	public static void main(String[] args) {

		int x = 12;
		String abc = "abc";
		System.out.println(x);
		Test(x);
		System.out.println(x);

		System.out.println(abc);
		Test(abc);
		System.out.println(abc);
	}

	private static void Test(int i) {

		i++;
	}

	private static void Test(String s) {

		s = "xyz";

	}

}
