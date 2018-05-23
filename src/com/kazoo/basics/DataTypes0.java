package com.kazoo.basics;

public class DataTypes0 {

	public static void main(String[] args) {
/*	A variable is nothing more than a name given to
 *  memory cell address 
 *  The type of data stored in a memory location is called the datatype
 * the variable allows us to access the value stored at that address
 * 
*/
		byte max = 127;
		byte min = -128;
		int c = 'a';
		char a = 'a';

		System.out.println("Max value a single byte can hold is:" + max);
		System.out.println("Min value a single byte acan hold is: " + min);
		
		System.out.println("A single character is 16 bits or 2 bytes\n"
				+ "That is the smae size as an integer so i can assign a character to an int type");
		System.out.println("look what happens: " + c);
		System.out.println("The integer value of the character based" + 
		"on the character encoding is returned");
		System.out.println("Here is the character: " + a);

		
	}

}

/*
 * In Java there are 8 datatypes
 * the int datatype consists of byte, short, int, long
 * the float datatype consists of float and double
 * char datatype is a character value
 * boolean datatype is a boolean value true or false
 */
/*
 * The integer datatypes differ in the number of bytes used to store 
 * a value. 
 * byte -> holds 8 bits or 1 byte
 * shor -> 16 bits or 2 bytes
 * int -> 32 bits or 4 bytes
 * long -> 64 bits or 8 bytes
 * float -> 32 bits or 4 bytes
 * double -> 64 bits or 8 bytes
 * char -> a single character 16 bits or 2 bytes
 * boolean -> true or false -> 
 */
