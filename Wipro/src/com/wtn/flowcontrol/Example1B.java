package com.wtn.flowcontrol;

public class Example1B {

	public static void main(String args[])
	{
		 int a=args[0].length()-1;
		 int b=args[1].length()-1;
		char c=args[0].charAt(a);
		char d=args[1].charAt(b);
		if(c==d)
		{
		System.out.println("true");
	
		}
		else
		{
		System.out.println("false");
		}
		}
}
