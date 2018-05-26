package com.kazoo.basics;

public class ThreDArray {
/*
 * Scenerio - there are 3 students, each students has taken 
 * 2 exams, each exam has two grades an internal and external grade
 */

	public static void main(String[] args) {
		int studentsExamsMarks[][][] = new int[3][2][2];
		
		studentsExamsMarks[0][0][0] = 68; // student 1, exam 1, internal grade
		studentsExamsMarks[0][0][1] = 86; // student 1, exam 1, external grade
		studentsExamsMarks[0][1][0] = 98; // student 1, exam 1, internal grade
		studentsExamsMarks[0][1][1] = 55; // student 1, exam 1, internal grade
		
		studentsExamsMarks[1][0][0] = 48; // student 2, exam 1, internal grade
		studentsExamsMarks[1][0][1] = 86; // student 2, exam 1, external grade
		studentsExamsMarks[1][1][0] = 98; // student 2, exam 2, internal grade
		studentsExamsMarks[1][1][1] = 55; // student 2, exam 2, external grade
		
		studentsExamsMarks[2][0][0] = 48; // student 3, exam 1, internal grade
		studentsExamsMarks[2][0][1] = 86; // student 3, exam 1, external grade
		studentsExamsMarks[2][1][0] = 98; // student 3, exam 2, internal grade
		studentsExamsMarks[2][1][1] = 55; // student 3, exam 2, external grade
		
		System.out.println("student 2 on his/her first exam received an internal mark of" + 
		studentsExamsMarks[1][0][0]);
		System.out.println("student 1 on his/her second exam received an external mark of " + 
		studentsExamsMarks[0][1][1]);
		
		System.out.println("Looping through all students, exams, and marks:");
		
		for(int student = 0; student < studentsExamsMarks.length; student++) {
			
			for(int exam = 0; exam < studentsExamsMarks[student].length; exam++) {
				
				for(int grade = 0; grade < studentsExamsMarks[student][exam].length; grade++) {
					System.out.println("Student number " + (student + 1) + " on exam " + ( exam +1) +
							" received on grade " + ( grade + 1) + " a mark of " + studentsExamsMarks[student][exam][grade]);
				}
				
			}
		}
		
// TODO try making another 3D array initialize using curly braces and find a new use case
		
		

	}

}
