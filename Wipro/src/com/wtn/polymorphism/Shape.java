package com.wtn.polymorphism;

abstract class Shape1
{
abstract void draw(); 

 abstract void erase();
 
 
 
 
}
class Circle extends Shape1
{
void draw()
{
System.out.println("draw circle");
}
void erase()
{
System.out.println("erase circle ");
}
}


class Triangle extends Shape1
{
void draw()
{
System.out.println("drawing triangle");
}
void erase()
{
System.out.println("earse triangle");
}
}

class Square extends Shape1
{
void draw()
{
System.out.println("drawing square");
}
void erase()
{
System.out.println("earse square");
}
}
public class Shape
{
public static void main(String args[])
{
Shape1 c=new Circle();
Shape1 t=new Triangle();
Shape1 s=new Square();
c.draw();
c.erase();
t.draw();
t.erase();
s.draw();
s.erase();
}
}




