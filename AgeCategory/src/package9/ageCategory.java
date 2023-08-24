package package9;

import java.util.Scanner;

public class ageCategory 
{
	 public static void categorizeAge(int n) 
	 {
		 if (n > 0 && n <= 12) 
		 {
			 System.out.println("Child");
	     } 
		 else if (n >= 13 && n <= 19) 
		 {
			 System.out.println("Teen");
	     } 
		 else if (n >= 20 && n <= 59) 
		 {
	         System.out.println("Adult");
	     }
		 else 
		 {
	         System.out.println("Senior"); // Fixed the category for ages 60 and above
	     }
	 }
	 public static void main(String[] args) 
	 {
	     Scanner scan = new Scanner(System.in);
	     System.out.println("Enter the Age=");
	     int n = scan.nextInt();
	     scan.close();
	     categorizeAge(n);
	 }
}
