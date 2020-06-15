package com.wtn.flowcontrol;

public class Example5 {
	public static void main(String[] args) {
		
	
	
	char value = args[0].charAt(0);
	
	if(Character.isDigit(value))
		System.out.println("Digit");
	else if(Character.isAlphabetic(value))
		System.out.println("Alphabetic");
	else
		System.out.println("Special Character");
			
		
	



}
	}
