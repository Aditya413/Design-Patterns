package com.aditech.ProblemSolving;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.println(findLongestPalindrome(scanner.nextLine()));
	    scanner.close();
	}
	
	public static String findLongestPalindrome(String s){
	      if(s.length()==1){
	        return s;
	      }

	      String longest = s.substring(0,1);
	      for(int i=0; i < s.length(); i=i+1) {

	        // check for odd length (center is i)
	        String temp = checkForEquality(s, i, i);
	        if(temp.length() > longest.length()){
	          longest = temp;
	        }

	        // check for even length (center is i, i+1)
	        temp = checkForEquality(s, i, i+1);
	        if(temp.length() > longest.length()){
	          longest = temp;
	        }
	      }

	      return longest;
	  }

	  public static String checkForEquality(String s, int begin, int end){
	    while(begin >=0 && end <= s.length()-1 && s.charAt(begin) == s.charAt(end)) {
	      begin--;
	      end++;
	    }
	    return s.substring(begin+1, end);
	  }
	  
}
