package com.wipro.loops;

public class Example4 {
	public static void main(String[] args) 
	{
        int num, rem=0, sum=0, temp;
       
       
       num= Integer.parseInt(args[0]);
		
      temp = num;
		
        while(num>0)
        {
            rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
		
        System.out.print("Sum of Digits of " +temp+ " is : " +sum); 
	}
}
