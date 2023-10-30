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
		double result=calculatorMO.calculate(a, b, operand);
		System.out.println("Result of Addition:"+result);
		double result1=calculatorMO.calculate(a, b, 0, operand);
		System.out.println("Result of Substraction:"+result1);
		double result2=calculatorMO.calculate(a, b, 0, operand);
		System.out.println("Result of Multiplication:"+result2);
		double result3=calculatorMO.calculate(a, b, 0, operand);
		System.out.println("Result of Division:"+result3);
	}
}
