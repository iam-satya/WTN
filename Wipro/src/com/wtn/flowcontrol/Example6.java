package com.wtn.flowcontrol;

public class Example6 {
	public static void main(String[] args) 
		{
			String interest = "";
			
			if(args[0].equalsIgnoreCase("Female"))
			{
				if(Integer.parseInt(args[1]) >= 1 && Integer.parseInt(args[1]) <= 58)
					interest = "8.2%";
				else if((Integer.parseInt(args[1]) >= 59 && Integer.parseInt(args[1]) <= 100))
					interest = "9.2%";
			}
			else
			{
				if(Integer.parseInt(args[1]) >= 1 && Integer.parseInt(args[1]) <= 58)
					interest = "8.4%";
				else if((Integer.parseInt(args[1]) >= 59 && Integer.parseInt(args[1]) <= 100))
					interest = "10.5%";
			}
				
			System.out.println("The percentage of interest rate is "+interest);
			
		

	}
}
