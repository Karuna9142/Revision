package com.abstraction.Interfcae;

abstract class Shape1
{
	//does not have a body
	abstract double area();
	
	//concrete method has body
	public void display()
	{
		System.out.println("This is a shape");
	}
}
class Rectangle1 extends Shape1
{
  private double length;
  private double breadth;
  
  public Rectangle1(double length, double breadth)
  {
	  this.length = length;
	  this.breadth = breadth;
  }
	@Override
	double area()
	{
		return length*breadth;
	}
	
}
class Circle1 extends Shape1
{
  private double radius;
  
  Circle1(double radius)
  {
	  this.radius = radius;
  }
	@Override
	double area()
	{
		return 3.14*radius*radius;
	}
	
}
class AbstractionShapeEx {

	public static void main(String[] args) {
		
		Shape1 rec = new Rectangle1(2,5);
		Shape1 cir = new Circle1(2);
		
		rec.display();
		System.out.println("Area of rectangle is:- "+rec.area());
		
		cir.display();
		System.out.println("Area of Circle is:- "+cir.area());
		
	}

}
