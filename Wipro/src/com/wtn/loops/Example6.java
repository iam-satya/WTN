package com.wtn.loops;

public class Example6 {
public static void main(String[] args) {
	int n=0;
    int reversenum =0;
    
    
    n= Integer.parseInt(args[0]);
    while( n != 0 )
    {
        reversenum = reversenum * 10;
        reversenum = reversenum + n%10;
        n = n/10;
    }

    System.out.println("Reverse of input number is: "+reversenum);
 
}
}
