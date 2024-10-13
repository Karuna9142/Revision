package com.looseCoupling;

//using interface we can achieve loose coupling
//created interface 
interface Engine 
{
	public void show();
}
class Car 
{
	Engine e;
	Car(Engine e)
	{
		this.e = e;
	}
	
	public void move()
	{
		System.out.println("Car moves with....");
		e.show();
	}
}
class petrolEngine implements Engine
{
	public void show()
	{
		System.out.println("This is petrol engine");
	}
}
class DieselEngine implements Engine
{
	public void show()
	{
		System.out.println("This is diesel engine");
	}
}
public class LooseCoupleEx {

	public static void main(String[] args) {
		Car c = new Car(new petrolEngine());
		c.move();
		Car c1 = new Car(new DieselEngine());
		c1.move();
				

	}

}
