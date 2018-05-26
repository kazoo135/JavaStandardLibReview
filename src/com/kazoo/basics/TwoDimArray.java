package com.kazoo.basics;

/*
 * 2D arrays can be though of as a table. Like an excel sheet.
 * row and cols. Each row contains an item, perhaps a student, and each column 
 * contains values for that item, perhaps a student's grades
 * if you get in trouble with this idea, draw a table for yourself to visualize
 */
public class TwoDimArray {

	public static void main(String[] args) {
		int studentTestScores[][]; // 2d array declarations
		
		//allocation of mem for student and tests - at this point [row][cols]
		//default values
		studentTestScores = new int[3][5]; 
		studentTestScores[0][0] = 88; 
		studentTestScores[0][1] = 76;
		studentTestScores[1][1] = 80;
		studentTestScores[2][0] = 70;
		
		System.out.println("Student 0 had a grade of " + studentTestScores[0][0] +
				" on his/her first test");
		System.out.println("Student 0 had a grade of " + studentTestScores[0][1] +
				" on his/her second test");
		System.out.println("Student 1 had a grade of " + studentTestScores[1][0] +
				" on his/her second test");
		System.out.println("Student 2 had a grade of " + studentTestScores[2][0] +
				" on his/her first test");
// 	Another way of initializing the 2D array - Can easily see it as an array inside each
// element of a single dim array. Each single dim array element is the row, 
//		The array inside is the col.
		int itemSizes[][] = { 
				{34, 37, 38}, // row 0 
				{25, 26, 27}, // row 1
				{42, 41, 40} // row 2
				};

		System.out.println("The value at item 1 size 2 is: " + 		itemSizes[1][2]);
//		looping through 2D arrays
		for(int row = 0; row < itemSizes.length; row++) {
			System.out.println("Row Num:" + row );
			for(int col = 0; col < itemSizes[row].length; col++) {
				System.out.println("Size stored at " + "["+row+"]"+"["+col+"]" + 
			" is " + itemSizes[row][col]);  
				
			}
		}
	}

}
