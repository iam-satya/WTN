package com.wtn.flowcontrol;

public class Example8 {

	public static void main(String[] args) {
	
		
		char c = args[0].charAt(0);
		
		String value = "";
		
		switch(c)
		{
			case 'R':
				value = "Red";
				break;
				
			case 'B':
				value = "Blue";
				break;
				
			case 'G':
				value = "Green";
				break;
				
			case 'O':
				value = "Orange";
				break;
				
			case 'Y':
				value = "Yellow";
				break;
				
			case 'W':
				value = "White";
				break;
				
			default:
				value = "Invalid Code";
		}
		
		System.out.println(value);
	}

	}

