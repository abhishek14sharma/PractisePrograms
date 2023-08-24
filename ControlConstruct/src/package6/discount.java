package package6;

import java.util.Scanner;

public class discount 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Amount In Dollars'$'=");
		double purchaseAmount=scan.nextDouble();
		scan.close();
		if(purchaseAmount>=100)
		{
			System.out.println("Discount Applicable");
		}
		else
		{
			System.out.println("Discount Not Applicable");
		}
	}

}
