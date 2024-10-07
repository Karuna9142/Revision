package com.abstraction.Interfcae;

abstract class Animals
{
	//abstract method
	abstract void makesound();
	
	//concrete method
	public void sleep()
	{}
	
}
class Dog extends Animals
{

	@Override
	void makesound() 
	{
		System.out.println("Barking....");
		
	}
	
}
class Cat extends Animals
{

	@Override
	void makesound() 
	{
		System.out.println("Meow....");
		
	}
	
}

public class AbstractMethodEx {

	public static void main(String[] args) {
		Animals a1 = new Dog();
		Animals a2 = new Cat();
		
		a1.sleep();
		a2.sleep();
		
		a1.makesound();
		a2.makesound();

	}

}
