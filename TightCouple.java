package com.tightCouple;

//in tightcouple class will dependent to one  other class
//we can make  petrolEngine or dieselEngine but not both
// if i want to change for that i will have to change my class name
class Car 
{
	petrolEngine e;
	Car()
	{
		e = new petrolEngine();
	}
	
	public void move()
	{
		System.out.println("Car moves with....");
		e.show();
	}
}
class petrolEngine
{
	public void show()
	{
		System.out.println("This is petrol engine");
	}
}
class DieselEngine
{
	public void show()
	{
		System.out.println("This is diesel engine");
	}
}
class TightCouple {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.move();

	}

}
