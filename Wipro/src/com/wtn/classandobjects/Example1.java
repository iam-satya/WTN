package com.wtn.classandobjects;


class Box
{
	
double height, width , depth;
	
Box(double height,double width,double depth)	
{
this.height=height;
this.width=width;
this.depth=depth;

}
double volume() 
{
	return this.height*this.width*this.depth;
}

}

public class Example1
{
	public static void main(String[] args)
	{
	
		Box b1=new Box(1.0,2.05,4.5);
		System.out.println("volume of the box is "+b1.volume());
	}	

}
