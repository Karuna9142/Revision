package com.interfaceex;

abstract class Vaccine
{
	int age;
	String nationality;
	
	Vaccine(int age, String nationality)
	{
		this.age = age;
		this.nationality = nationality;
	}
	//concrete methods
	public void firstDose()
	{
		if(age>=18 && nationality=="Indian")
		{
			System.out.println("Done. Now You have to pay 250 rs");
		}
		else
		{
			System.out.println("Not eligible for first dose");
		}
	}
	public void SecondDose(boolean firstDoseCompleted)
	{
		if(firstDoseCompleted)
		{
			System.out.println("You can take second Dose");
		}
		else
		{
			System.out.println("Can't take second dose");
		}
	}
	//abstract method
	abstract void boosterDose();
	
}
class VaccinationSuccessful extends Vaccine
{

	VaccinationSuccessful(int age, String nationality) {
		super(age, nationality);
		
	}

	@Override
	void boosterDose() 
	
	{
		System.out.println("Vaccination Successful");
		
	}
	
}
public class VaccineEx {

	public static void main(String[] args) {
		Vaccine v1 = new VaccinationSuccessful(20, "Indian");
		
		v1.firstDose();
		v1.SecondDose(true);
		v1.boosterDose();

	}

}
