package package22;

import java.util.Scanner;

public class methodmain 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		scan.close();
		armstrong theArmstrong=new armstrong();
		boolean res=theArmstrong.isArmstrong(num);
		if(res==true)
		{
			System.out.println("Given Number is Armstrong");
		}
		else
		{
			System.out.println("Given Number is Not Armstrong");
		}
	}

}
