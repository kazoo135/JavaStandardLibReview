package com.kazoo.basics;

import java.util.Scanner;

/*
 * Demonstrates how to obtain user input from keyboard
 * using Scanner class
 * Also demonstrates some Scanner class methods
 */
public class GetUserInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age; 
		age = input.nextInt();
		System.out.println(age);
		input.close();

	}

}
