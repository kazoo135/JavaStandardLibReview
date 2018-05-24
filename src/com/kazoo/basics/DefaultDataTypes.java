package com.kazoo.basics;

public class DefaultDataTypes {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean bul;

	public static void main(String[] args) {
		
		DefaultDataTypes def = new DefaultDataTypes(); 
		System.out.println("Default value of byte is: " + def.b);
		System.out.println("Default value of short is: " + def.s);
		System.out.println("Default value of int is: " + def.i);
		System.out.println("Default value of long is: " + def.l);
		System.out.println("Default value of float is: " + def.f);
		System.out.println("Default value of double is: " + def.d);
		System.out.println("Default value of char is: " + def.c);
//		don't be fooled by default value of char - it is space character
		System.out.println("Default value of boolean is: " + def.bul);

	}

}
