package Package5;

public class swapNumber 
{
	public static void swapUsingBitwise(int num1, int num2)
	{
		int num;
		num=num1;
		num1=num ^ num2;
		num2=num1 ^ num2;
		num1=num1 ^ num2;
		System.out.println("After Swapping:First="+num1+" Second="+num2);
	}
}