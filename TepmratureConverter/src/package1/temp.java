package package1;

import java.util.Scanner;

public class temp 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Temprature Conversion Tool");
		System.out.println("                                     ");
		System.out.println("Select Your option:");
		System.out.println("                                     ");
		System.out.println("1.Convert Celcius to Fahrenheit");
		System.out.println("                                     ");
		System.out.println("2.Convert Farhenheit to Celcius");
		System.out.println("                                     ");
		System.out.println("Enter Your Choice");
		Scanner scan=new Scanner(System.in);
		int option=scan.nextInt();
		if (option==1)
		{
			System.out.println("Enter Your Temprature in Celcius=");
			double celsius= scan.nextDouble();
			double result1=tempc2f.celsiusToFahrenheit(celsius);
			System.out.println(celsius+"C is equvalent to "+result1+"F");
		}
		else if (option==2)
		{
			System.out.println("Enter Your Temprature in Fahrenheit=");
			double fahrenheit=scan.nextDouble();
			double result1= tempf2c.fahrenheitToCelsius(fahrenheit);
			System.out.println(fahrenheit+"F is equivalent to "+result1+"C");
		}
		else
		{
			System.out.println("Invalid Input");
			scan.close();
		}
	}	
}