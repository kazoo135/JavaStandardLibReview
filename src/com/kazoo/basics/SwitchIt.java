package com.kazoo.basics;

import java.util.Scanner;

/*
 * Think if cswitch condition matches case then do something 
 */
public class SwitchIt {

	public static void main(String[] args) {
//		System.out.print("If age great than 65 enter A \n");
//		System.out.print("If age great than 21 buth less than 65 enter B \n");
//		System.out.println("If age greater than 13 but less than 21 enter C\n");
	Scanner input = new Scanner(System.in);
//		String c = input.next(); 
//		
//		switch(c.toLowerCase()) {
//		case "a":
//				System.out.print("You are mature\n");
//			break;
//		case "b":
//				System.out.print("You are an adult");
//			break;
//		case "c":
//			System.out.println("You are a teenager");
//			
//		default:
//			System.out.print("You should not be using this machine");
//		
//		}
//	System.out.println("********************");
//	System.out.println("If grade greater than 90, Enter 1");
//	System.out.println("If grade greater than 80 but less than 90 Enter 2");
//	input.nextLine();
//	int grade = input.nextInt();
//	switch(grade) {
//	case 1:
//		System.out.println("You got an A");
//		break;
//	case 2: 
//		System.out.println("You got a B");
//		break; 
//		default: 
//			System.out.println("YOu did not get and a or a b");
//	
//	}
	
//	String season;
//	System.out.println("What is your favorite season? ");
//	season = input.next();
//	
//	switch(season.toLowerCase()) {
//	
//		case "winter":
//			System.out.println("what is so great about Spring?");			
//			break;
//		case "spring":
//			System.out.println("what is so great about Spring?");
//			break;
//		case "summer":
//			System.out.println("what is so great about Spring?");
//			break;
//		case "fall":
//			System.out.println("what is so great about Spring?");
//			break;
//			default: 
//				System.out.println("Where do you live man!");
//		}c
	System.out.print("Enter a 'a,b' or 'c': ");
	int c = input.nextByte();
	System.out.println( (char)c);
	input.close();
	}

}//EOC
