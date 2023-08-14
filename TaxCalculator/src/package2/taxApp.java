package package2;

import java.util.Scanner;

public class taxApp 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Purchase Amount=");
		Scanner scan=new Scanner(System.in);
		double purchaseamount=scan.nextDouble();
		System.out.println("Enter the Tax Rate(in decimal form)");
		double tax=scan.nextDouble();
		double result=taxCalculation.calculateTotalWithTax(purchaseamount, tax);
		System.out.println("Total Coxt including Tax= "+result);
		scan.close();
	}
}