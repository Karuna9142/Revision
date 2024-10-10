package com.methodOverriding;

class Human
{
	void eat()
	{
		System.out.println("Homan is eating..");
	}
}
class Boy extends Human
{
	
	void eat()
	{
		super.eat();
		System.out.println("Boy is eating...");
	}
}
public class MethodOverridingEx {

	public static void main(String[] args) {
		Boy b1 = new Boy();
		b1.eat();

	}

}
