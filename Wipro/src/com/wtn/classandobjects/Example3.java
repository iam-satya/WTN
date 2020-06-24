package com.wtn.classandobjects;
class Patient
{
	String patientName;
	double height, weight;
	Patient(String patientName,double height,double weight)
	{
		this.patientName=patientName;
		this.height=height;
		this.weight=weight;
		
		
	}
		double computeBMI()
	{
		return this.weight/(this.height*this.height);
	}
}



public class Example3 {
	public static void main(String[] args) 
	{
		
		
		Patient p1=new Patient("aa",5.6,70);
		
		
		System.out.println("Bmi rate"+p1.computeBMI());
		
	}

}
