package package23;

public class patternSixteen 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int m=5;m>=1;m--)
		{
			for(int n=5;n>=m;n--)
			{
				System.out.print(" ");
			}
			for(int o=5;o>=m;o--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}