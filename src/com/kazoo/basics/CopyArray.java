package com.kazoo.basics;

/*
 * Copying contents of one array into another
 */
public class CopyArray {

	public static void main(String[] args) {
		int temps[] = {55,888,33, 77, 200 };
		int tempsCopy[] = new int[temps.length];
		
		System.out.println("Temps Array Values");
		for(int i = 0; i < temps.length; i++) {
			System.out.println(temps[i]);
		}
		
/*		Remember - temps is a variable name which is just the address of
 * a memory location. temps is the address of the first memeory cell
 * when you assign another array as below tempsCopy will just point to temps. It is not
 * independent. The memory in tempsCopy is not referenced and is deleted by Java
 * automatically. Note that if you change a value in temps - it is reflected in tempsCopy.
 * So tempsCopy is pointing to temps.
 *  */
		
		System.out.println("From tempsCopy Array");
		tempsCopy = temps; 
		for(int i = 0; i < tempsCopy.length; i++) {
			System.out.println(tempsCopy[i]);
		}
	
//	To give tempcopy its independence - It has its own memory rather than referenceing temps
//		You can use the System.arrayCopy() mehtod
		System.arraycopy(temps, 1, tempsCopy, 1, temps.length-1);
		System.out.println("After using the arraycopy mehtod: ");
		for(int i =0; i < temps.length; i++) {
			System.out.println(tempsCopy[i]);
		}
		System.out.println("After assigning new value to tempsCopy");
		tempsCopy[1] = 22; 
		for(int t : tempsCopy) {
			System.out.println(t);
		}
	}

}
