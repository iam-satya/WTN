package com.wtn.loops;

public class Example3 {
	public static void main(String []args)
	{ int i,temp;
	boolean isPrime=true;
		int a=Integer.parseInt(args[0]);
		for(i=2;i<=a/2;i++)
		{
			temp=a%i;
			if(temp==0)
			{isPrime=false;
		break;
			}
		}
		
		if(isPrime)
			   System.out.println(a + " is a Prime Number");
			else
			   System.out.println(a + " is not a Prime Number");
	}

}
