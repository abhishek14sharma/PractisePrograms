package package8;

public class forbreakLoop 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			for(;;)
			{
				System.out.println("Kodnest");
				break;
			}
		}
		
	}

}
//Hello Kodnest get printed 5 times alternatively