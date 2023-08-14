package package3;

import java.util.Scanner;

public class calculatorApp 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the first numbers=");
		int a=scan.nextInt();
		System.out.println("Enter the second numbers=");
		int b=scan.nextInt();
		System.out.println("For Addition Press 1");
		System.out.println("For Substraction Press 2");
		System.out.println("For Multiplication Press 3");
		System.out.println("For Division Press 4");
		int i=scan.nextInt();
		scan.close();
		calculator c1 = new calculator();
		int result=c1.calculation(a, b, i);
		System.out.println("Result="+result);
	}

}
