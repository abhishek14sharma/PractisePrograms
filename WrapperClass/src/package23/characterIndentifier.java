package package23;

public class characterIndentifier 
{
	public static void characterIdentify(char ch)
	{
		if(Character.isLowerCase(ch))
		{
			if(isvowel(ch))
			{
				System.out.println("Lower-Case Vowel");
			}
			else
			{
				System.out.println("Lower-Case Consonant");
			}
		}
		else if(Character.isUpperCase(ch))
		{
			if(isvowel(ch)) 
			{
				System.out.println("Upper-Case Vowel");
			}
			else
			{
				System.out.println("Upper-Case Consonat");
			}
		}
		else if(Character.isDigit(ch))
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character");
		}
	}
	public static boolean isvowel(char ch)
	{
		ch='a'^'e'^'i'^'o'^'u';
		return true;
	}
}