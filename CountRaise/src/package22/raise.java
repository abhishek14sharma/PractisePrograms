package package22;

public class raise 
{
	public static int raiseN(int num,int power)
	{
		int res=1;
		for(int i=1;i<=power;i++)
		{
			res=num*res;
		}
		return res;
	}
}