package package4;

import java.util.Scanner;

public class validInputApp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Is Input Valid(True/False)");
		boolean input=scan.nextBoolean();
		System.out.println("Does Input meet a Certain Condition(True/False)");
		boolean condition=scan.nextBoolean();
		scan.close();
		boolean result=validInput.isValidInput(input, condition);
		if (result)
		{
			System.out.println("Input is Valid");
		} else
			System.out.println("Input is Invalid");
	}
}
