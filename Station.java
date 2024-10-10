package com.interfaceex;

class HillStation 
{
 public void location()
 {
	 System.out.println("Location is");
 }
 public void famousFor()
 {
	 System.out.println("famous for ");
 }
}
class Manali extends HillStation
{
	public void location()
	 {
		 System.out.println("Manali is in Himachal Pradesh");
	 }
	 public void famousFor()
	 {
		 System.out.println("famous for Hadimba Temple and adventure sports");
	 }
}
class Mussoorie extends HillStation
{
	public void location()
	 {
		 System.out.println("Musoorie is in Uttarakhand");
	 }
	 public void famousFor()
	 {
		 System.out.println("It is famous for education institution");
	 }
}
class Gulmarg extends HillStation 
{
	public void location()
	 {
		 System.out.println("Gulmarg is in J&K");
	 }
	 public void famousFor()
	 {
		 System.out.println("It is famous for skiing");
	 }
}
public class Station {

	public static void main(String[] args) {
		HillStation h1 = new HillStation();
		h1.location();
		h1.famousFor();
		
		Manali m1 = new Manali();
		m1.location();
		m1.famousFor();
		
		Mussoorie m2 = new Mussoorie();
		m2.location();
		m2.famousFor();
		
		Gulmarg g1 = new Gulmarg();
		g1.location();
		g1.famousFor();

	}

}
