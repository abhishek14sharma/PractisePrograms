package package13;

import java.util.Scanner;

public class numberTable 
{
	public static void printTable(int n)
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println(n+" x "+i+" = "+n*i);
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number=");
		int n= scan.nextInt();
		scan.close();
		printTable(n);	
	}
}