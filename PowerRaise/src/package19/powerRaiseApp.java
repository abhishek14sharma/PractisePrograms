package package19;

import java.util.Scanner;

public class powerRaiseApp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number= ");
		int num=scan.nextInt();
		scan.close();
		int result=powerRaise.power(num);
		System.out.println(result);
	}
}