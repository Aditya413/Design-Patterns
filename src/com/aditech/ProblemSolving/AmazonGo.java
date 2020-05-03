package com.aditech.ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AmazonGo {

	public static void main(String[] args) {

		List<ArrayList<Integer>> grid = new ArrayList<ArrayList<Integer>>();

		/* Adding values to 0th row created above grid */
		grid.add(new ArrayList<Integer>(Arrays.asList(1, 1, 0, 0)));

		/*
		 * Creating 1st row and adding values
		 * (another way for adding values in 2D collections)
		 */
		grid.add(new ArrayList<Integer>(Arrays.asList(0, 0, 1, 0)));

		/* Add 2nd row grid */
		grid.add(new ArrayList<Integer>(Arrays.asList(0, 0, 1, 0)));

		/* Add 3rd row grid */
		grid.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0)));

		/* Add 4th row grid */
		grid.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1, 1)));

		/* Add 5th row grid */
		grid.add(new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1)));

		System.out.println(numberAmazonGoStores(5, 4, grid));

	}

	static int numberAmazonGoStores(int rows, int column,
			List<ArrayList<Integer>> grid) {

		int row[] = new int[rows];
		int col[] = new int[column];
		int i, j;

		for (i = 0; i < rows; i++) {
			for (j = 0; j < column; j++) {
				if (grid.get(i).get(j) == 1) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		int count = 0;
		for (i = 0; i < rows; i++) {
			for (j = 0; j < column; j++) {
				if (row[i] == 1 && col[j] == 1) {
					count += 1;
					break;
				}
			}
		}

		return count;
	}

}
