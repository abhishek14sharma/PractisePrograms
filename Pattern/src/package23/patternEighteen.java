package package23;

public class patternEighteen 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int m=2;m<=5;m++)
		{
			for(int n=1;n<=m;n++)
			{
				System.out.print(" ");
			}
			for(int o=1;o<=m;o++)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}