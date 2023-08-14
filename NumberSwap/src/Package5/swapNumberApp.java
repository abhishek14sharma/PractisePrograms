package Package5;

import java.util.Scanner;

public class swapNumberApp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first Integer:");
		int num1=scan.nextInt();
		System.out.println("Enter the second Integer");
		int num2=scan.nextInt();
		scan.close();
		swapNumber.swapUsingBitwise(num1, num2);	
	}
}
