package com.interfaceex;

class Animal
{
	public void makeSound()
	{
		System.out.println("Animal makes a sound.");
	}
}
class Dog extends Animal 
{
	public void makeSound()
	{
		System.out.println("Dog barks....");
	}
}
class Cat extends  Dog
{
	public void makeSound()
	{
		System.out.println("Cat meows...");
	}
}
public class Sound {

	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		a1.makeSound();
		
		Dog d1 = new Dog();
		d1.makeSound();
		
		Cat c1 = new Cat();
		c1.makeSound();

	}

}
