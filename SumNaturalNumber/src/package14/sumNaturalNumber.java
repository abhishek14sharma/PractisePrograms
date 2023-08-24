package package14;

import java.util.Scanner;

public class sumNaturalNumber 
{
	public static void calculateSum(int n)
	{
		int i;
		int sum=0;
		for(i=0;i<=n;i++)
		{
			sum = sum+ i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number=");
		int n= scan.nextInt();
		scan.close();
		calculateSum(n);
	}
}