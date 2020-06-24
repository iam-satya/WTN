package com.wtn.Inheritance;
class Animal 
{
public Animal() 
{
    System.out.println("A new animal has been created!");
}   
public void sleep() {
    System.out.println("animal sleeps");
}
public void eats() {
    System.out.println("animal eats");
}
}


class Bird  extends Animal {

public Bird() {
    super();
    System.out.println("A new bird has been created!");
    
}
public void sleep() {
    System.out.println("bird sleeps");
}
public void eats() {
    System.out.println("bird eats");
}

}


class Dog extends Animal {

public Dog() {
    super();
    System.out.println("A new dog has been created!");
   }
public void sleep() {
    System.out.println("dog sleeps");
}
public void eats() {
    System.out.println("dog eats");
}
}


public class Animalmain 
{
	public static void main(String[] args) {
	   
	    
	    Bird bird = new Bird();
	    Dog dog = new Dog();
	    bird.eats();
	    dog.sleep();
	    

	}
}
