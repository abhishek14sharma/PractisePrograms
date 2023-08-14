package Package6;

import java.util.Scanner;

public class calculatorMOApp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int a= scan.nextInt();
		System.out.println("Enter the Second Number:");
		int b= scan.nextInt();
		System.out.println("Enter the Operator(+,-,*,/):");
		char operand=scan.next().charAt(0);
		scan.close();
		long result=calculatorMO.calculate(a, b, operand);
		System.out.println("Result:"+result);
	}
}
