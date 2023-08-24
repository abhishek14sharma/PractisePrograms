package package11;

import java.util.Scanner;

public class polygonIdentifier 
{
	public static void identifyPolygon(int sides)
	{
		switch(sides)
		{
		case 3:
			{System.out.println("Triangle");
			break;}
		case 4:
			{System.out.println("Quadrilateral");
			break;}
		case 5:
			{System.out.println("Pentagon");
			break;}
		case 6:
			{System.out.println("Hexagon");
			break;}
		default:
			{System.out.println("Invalid Input");
			break;}
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number of Sides=");
		int sides=scan.nextInt();
		scan.close();
		identifyPolygon(sides);	
	}
}