package com.wtn.flowcontrol;

public class Example7 {
	
	public static void main(String[] args) 
	{
	
		
			char inp = args[0].charAt(0);
		if(inp>= 'A' && inp<= 'Z')
			inp= Character.toLowerCase(inp);
		else
			inp = Character.toUpperCase(inp);
		
		System.out.println(inp);
		
	
	}

}
