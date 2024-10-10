package com.interfaceex;

interface Vehicle 
{
	void changeGear(int a);
	void speedUp(int a);
	void applyBrakes(int a);
}
class Bicycles implements Vehicle 
{
    int speed;
    int gear; 
    
    // to change gear
	@Override
	public void changeGear(int newGear) {
		gear = newGear;
		
	}
   // to increase speed
	@Override
	public void speedUp(int increment)
	{
		speed = speed+increment;
		
	}
    // to decrease speed
	@Override
	public void applyBrakes(int decrement) {
		speed = speed - decrement;
		
	}
	public void printState()
	{
		System.out.println("Speed:- "+speed+ " Gear:- "+gear);
	}
	
}
class Bike implements Vehicle {

	int speed;
	int gear;
	
	@Override
	public void changeGear(int newGear) {
		gear = newGear;
	}
    // to increase speed
	@Override
	public void speedUp(int increment) {
		speed = speed+increment;	
	}
	@Override
	public void applyBrakes(int decrement) {
		speed = speed-decrement;
	}
	
	public void printState()
	{
		System.out.println("Speed:- "+speed+ " Gear:- "+gear);
	}
	
}
public class InterfaceEx {

	public static void main(String[] args) {
		Bicycles b1 = new Bicycles();
		b1.changeGear(2);
		b1.speedUp(10);
		b1.applyBrakes(4);
		
		System.out.println("Bicycles present safe:- ");
		b1.printState();
		
		
		Bike b2 = new Bike();
		b2.changeGear(3);
		b2.speedUp(20);
		b2.applyBrakes(5);
        
		System.out.println("Bike present safe:- ");
		b2.printState();
	}

}
