package package19;

import java.util.Scanner;

public class greatestCommonDivider 
{
	public static void findGCD(int a, int b)
	{
		int rmn=0;
		for(int i=1;i<=a&&i<=b;i++)
		{
			rmn=a%b;//Eucledian Approach
			a=b;
			b=rmn;
			if(a==0^b==0)
			{
				System.out.println(a);
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First Number=");
		int a= scan.nextInt();
		System.out.println("Enter Second Number=");
		int b=scan.nextInt();
		scan.close();
		findGCD(a, b);	
	}
}