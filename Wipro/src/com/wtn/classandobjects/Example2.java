package com.wtn.classandobjects;
class Calculator
{
	static double powerInt(int num1,int num2)
	{
		return Math.pow(num1, num2);
	}
	static double powerDouble(double num1,double num2)
	{
		return Math.pow(num1, num2);
	}

}

public class Example2 {
public static void main(String[] args) {
	
System.out.println(Calculator.powerInt(15,15));
System.out.println(Calculator.powerDouble(1.5,15));
}
}
