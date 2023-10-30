package package23;

import java.util.Scanner;

public class alphabetApp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an Alphabet=");
		String alpha=scan.next();
		scan.close();
		alphabet.alphabetidentify(alpha);	
	}
}