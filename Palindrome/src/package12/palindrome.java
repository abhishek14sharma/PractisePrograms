package package12;

import java.util.Scanner;

public class palindrome 
{
	public static boolean checkPalindrome(int num)
	{
		int reverse=0;
		int num1=num;
		while(num1>0)
		{
			int lastdigit=num1%10;
			reverse=reverse*10+lastdigit;
			num1=num1/10;
		}
		return num==reverse;
	}
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a Number=");
		int num=scan.nextInt();
		scan.close();
		boolean result=checkPalindrome(num);
		System.out.println(result);
	}
}