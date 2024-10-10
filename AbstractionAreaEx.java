package com.abstraction.Interfcae;

abstract class Shapes {
	String color;

	//abstract method
	abstract double area();
	public abstract String toString();
	
	Shapes(String color)
	{
		this.color = color;
	}
	//concrete method
	public String getColor()
	{
		return color;
	}
}
class Circles extends Shapes
{
  double radius;
	Circles(String color, double radius)
	{
		super(color);
		System.out.println("Circle constructor called");
		this.radius = radius;
		
	}

	@Override
	double area() {
		return 3.14*radius*radius;
	}

	@Override
	public String toString() {
		return "circle color is :- " +super.getColor()+ "and area is:- "+area();
	}
	
}
class Rectangles extends Shapes
{
   double length;
   double breadth;
   
   Rectangles(String color, double length, double breadth)
   {
	   super(color);
	   this.length = length;
	   this.breadth = breadth;
	   
   }

@Override
double area() {
	
	return length*breadth;
}

@Override
public String toString() {
	return "rectangle color  is:- " +super.getColor()+ " Area of rectangle:- "+area();
}
	
}
public class AbstractionAreaEx {

	public static void main(String[] args) {
		Shapes cir = new Circles("Blue..",2.5);
		Shapes rec = new Rectangles("Red.. ", 5, 10);
		
		System.out.println(cir.toString());
		System.out.println(rec.toString());

	}

}
