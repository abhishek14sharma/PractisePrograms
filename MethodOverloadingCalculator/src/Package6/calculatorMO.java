package Package6;

public class calculatorMO 
{
	public static int calculate(int a, int b, char operand)
	{
		int result=0;
		switch(operand)
		{
		case '+':
			result=a+b;
		}
		return result;
	}
	public static void int calculate(int a, int b, char operand)
	{
		int result=0;
		switch(operand)
		{
		case '-':
			result=a-b;
		}
	}
	public static int calculate(int a, int b, float c, char operand)
	{
		int result=0;
		switch (operand)
		{
		case '*':
			result=a*b;
		}
		return result;
	}
	public static int calculate(int a, int b, long c, char operand)
	{
		int result=0;
		switch (operand)
		{
		case '/':
			result=a/b;
		}
		return result;
	}

}
