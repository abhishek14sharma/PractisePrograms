package package3;

public class calculator 
{
	public int calculation(int a, int b, int i)
	{
		int result=0;
		switch(i)
		{
		case 1:
			result=a+b;
			break;
		case 2:
			if (a>b)
			{
				result=a-b;
			}
			else
			{
				result=b-a;
			}
			break;
		case 3:
			result=a*b;
			break;
		case 4:
			result=a/b;
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		return result;
	}

}
