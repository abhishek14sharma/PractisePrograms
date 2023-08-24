package pacage18;

import java.util.Scanner;

public class factorial 
{
	public static void calculateFactorial(int n)
	{
		int product=1;
		for(int i=1;i<=n;i++)
		{
			product=product*i;
		}
		System.out.println(product);
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number=");
		int n=scan.nextInt();
		scan.close();
		calculateFactorial(n);
	}
}