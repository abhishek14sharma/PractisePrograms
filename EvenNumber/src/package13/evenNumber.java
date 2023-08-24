package package13;

import java.util.Scanner;

public class evenNumber 
{
	public static void printEvenNumber(int n)
	{
		int i;
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number=");
		int n= scan.nextInt();
		scan.close();
		printEvenNumber(n);	
	}
}