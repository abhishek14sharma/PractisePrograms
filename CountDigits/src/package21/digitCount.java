package package21;

public class digitCount 
{
	public static int countDigit(int num)
	{
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		return count;
	}
}