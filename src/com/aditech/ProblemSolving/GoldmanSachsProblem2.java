package com.aditech.ProblemSolving;

import java.util.Scanner;

/*
 * Given a string, recursively remove adjacent duplicate characters from the string. 
 * The output string should not have any adjacent duplicates
 * 
 * for ex : 
 * 	Input: azxxzy
	Output: ay
	First “azxxzy” is reduced to “azzy”.
	The string “azzy” contains duplicates,
	so it is further reduced to “ay”
 */
public class GoldmanSachsProblem2 {

	public static void main(String[] args) {
		System.out.println("Enter the string from which you want to remove the duplicates");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		removeDuplicates(input);
		sc.close();
	}
	
	private static void removeDuplicates(String input){
		char[] inputArr = input.toCharArray();
		String output = "";
		for(int i=0, j=i+1; j < inputArr.length; i++, j++) {
			if(inputArr[i] == inputArr[j]){
				output = filterString(i, input);
				removeDuplicates(output);
			}
		}
		
		System.out.println(inputArr.toString());
	}
	
	private static String filterString(int charIndex1, String input){
		StringBuilder stb = new StringBuilder(input);
		stb.deleteCharAt(charIndex1);
		stb.deleteCharAt(charIndex1);
		
		return stb.toString();
	}

}
