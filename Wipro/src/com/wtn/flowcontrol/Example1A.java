package com.wtn.flowcontrol;

public class Example1A {
	public static void main(String args[])
	
	{
		int number =Integer.parseInt(args[0]);
		if(number>0)
		{
			System.out.println("given integer number is Positive");
		}
		else if(number==0)
		{
			System.out.println("given integer number is Zero");
		}
		else if(number<0)
		{

			System.out.println("given integer number is negitive");
		}

			
	}

}
