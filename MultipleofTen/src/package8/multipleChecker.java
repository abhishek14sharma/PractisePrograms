package package8;

import java.util.Scanner;

public class multipleChecker 
{
	public static void mutipletenchecker(int n)
	{
		if(n%10==0)
		{
			System.out.println("The Number is Multiple of 10");
		}
		else
		{
			System.out.println("The number is not Multiple of 10");
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number=");
		int n=scan.nextInt();
		scan.close();
		mutipletenchecker(n);	
	}
}