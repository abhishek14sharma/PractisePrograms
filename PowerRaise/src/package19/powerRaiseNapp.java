package package19;

import java.util.Scanner;

public class powerRaiseNapp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number=");
		int num=scan.nextInt();
		System.out.println("Enter a power=");
		int power=scan.nextInt();
		scan.close();
		int res=powerRaiseN.raiseN(num, power);
		System.out.println(res);
	}
}