package package7;

import java.util.Scanner;

public class gradeCheck 
{
	public static void gradeChecks(int grade)
	{
		if(grade>50)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Marks=");
		int grade=scan.nextInt();
		scan.close();
		gradeCheck.gradeChecks(grade);	
	}
}
