package com.aditech.ProblemSolving;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Given a range of numbers [x, y] and an integer q. Multiply all the numbers 
 * in the range by q and return the count of all the numbers which have no 
 * same digits as the corresponding product obtained.
   Ex- If x=10, y=12, q=2. Then the products corresponding to 10, 11, 12 are 20, 22, 24.
   The count will be 1 as only 22 has all different digits than 11.
 */
public class GoldmanSachsProblem1 {
	static int x,y,q = 0;
	static int count = 0;
	
	GoldmanSachsProblem1(){}
	
	public static void main(String[] args) {
		System.out.println("Enter two number for creating a range. Remember, the first number must be smaller than second number");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		if(checkRangeValue(x,y) == 0) {
			System.out.println("Enter the number to multiply with");
			q = sc.nextInt();
			sc.close();
			createRangeMap(x,y,q);
			System.out.println("The count is : " +count);
		} else {
			System.out.println("Sorry! Can not proceed as the range values are incorrect.");
		}
	}
	
	private static int checkRangeValue(int x, int y){
		return x < y ? 0 : 1;
	}
	
	private static void createRangeMap(int x, int y, int q) {
		Map<Integer, Integer> rangeMap = new HashMap<Integer, Integer>(); 
		for(int i = x; i<=y; i++){
			rangeMap.put(i, i*q);
		}
		checkProductObtained(rangeMap);
	}
	
	private static void checkProductObtained(Map<Integer, Integer> rangeMap) {
		for(Map.Entry<Integer, Integer> entry : rangeMap.entrySet()){
			Integer number = entry.getKey();
			Integer product = entry.getValue();
			if(!checkIfNumbersAreSame(number,product)){
				count++;
			}
		}
	}
	
	private static boolean checkIfNumbersAreSame(Integer number, Integer product){
		char[] numberArr = number.toString().toCharArray();
		for(int i=0; i<numberArr.length; i++){
			if(product.toString().contains(String.valueOf(numberArr[i]))){
				return true;
			};
		}
		return false;
	}
}
