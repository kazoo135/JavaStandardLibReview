package com.kazoo.basics;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		double x = 33.3; 
		float y = 55.34f; 
		int grades[];
		float temps[] = { 44.7f, 44.2f, 33.2f};
		float totalTemps = (float) 0.0;
		grades = new int[5];
		grades[0] = 90;
		grades[1] = 97;
		grades[2] = 88;
		grades[3] = 96;
		grades[4] = 58;
		System.out.println(grades[0]);
		
		for (int g : grades) {
			if(g > 90)
			System.out.printf("%d\t\n",g);
			else
				System.out.println("Your grade was less than 90");
		}
		
		System.out.println("Print temps:");
		for(int i = 0; i < temps.length; i++) {
			System.out.printf("%.2f ", temps[i]);
			totalTemps += temps[i];
		}
		
		float avgTemp = totalTemps/temps.length;
		System.out.printf("\nAverage temp is %.3f", avgTemp);
		
		System.out.println("Reading user input into and array:");
		Scanner input = new Scanner(System.in);
		System.out.println("How many items did you purchase?");
		int numItems = input.nextInt();
		String items[] = new String[numItems];
		
		for(int i = 0; i < items.length; i++) {
			System.out.println("Enter Item " + (i+1) );
			items[i] = input.next();
		}
		System.out.println("Your items are: ");
		for (String item : items) {
			System.out.println(item);
		}
		
		input.close();
	}

}
