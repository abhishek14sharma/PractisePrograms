package package16;

import java.util.Scanner;

public class primeNumber 
{
	public static void printPrimes(int n)
	{
		int count=0;
		for(int i=3;count<n;i++)
		{
			boolean res=checkPrime(i);
			if(res==true)
			{
				System.out.println(i+" ");
				count++;
			}
		}
	}
	public static boolean checkPrime(int n)
	{
		for(int i=2;i<=n;i++)
		{
			if (n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number=");
		int n= scan.nextInt();
		scan.close();
		printPrimes(n);	
	}
}