package package6;

import java.util.Scanner;

public class checkDiscount 
{
	public static void checkDiscount(double purchaseAmont)
	{
		if(purchaseAmont>=100)
		{
			System.out.println("Discount Applicable");
		}
		else
		{
			System.out.println("Discount Not Applicable");
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Amount=");
		double purchaseAmount=scan.nextDouble();
		scan.close();
		checkDiscount(purchaseAmount);	
	}
}