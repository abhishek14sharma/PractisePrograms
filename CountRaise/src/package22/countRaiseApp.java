package package22;

import java.util.Scanner;

public class countRaiseApp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number=");
		int num=scan.nextInt();
		scan.close();
		int pow=count.countDigit(num);
		int res=raise.raiseN(num, pow);
		System.out.println("The Number when raised to "+pow+" the result is "+res);
	}
}