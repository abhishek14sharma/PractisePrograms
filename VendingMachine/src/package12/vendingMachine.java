package package12;

import java.util.Scanner;

public class vendingMachine 
{
	public static void getProduct(String code)
	{
		switch(code)
		{
		case "P01":
		{
			System.out.println("Pepsi");
			break;
		}
		case "P02":
		{
			System.out.println("CocaCola");
			break;
		}
		case "P03":
		{
			System.out.println("Fanta");
			break;
		}
		case "P04":
		{
			System.out.println("JalJeera");
			break;
		}
		case "P05":
		{
			System.out.println("MountainDew");
			break;
		}
		case "P06":
		{
			System.out.println("BoatGuava");
			break;
		}
		default:
		{
			System.out.println("Panaka");
			break;
		}
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Code=");
		String code=scan.next();
		scan.close();
		getProduct(code);
	}
}