package package14;

import java.util.Scanner;

public class printFibonacci 
{
	public static void printFibonacciSeries(int n)
	{
		int num1=0;
		int num2=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(num1+" ");
			int res=num1+num2;
			num1=num2;
			num2=res;
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number=");
		int n= scan.nextInt();
		scan.close();
		printFibonacciSeries(n);
	}
}