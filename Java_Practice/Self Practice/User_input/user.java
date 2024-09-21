import java.util.Scanner;

public class user
{ 
	public static void main(String[]args)
	{
	  Scanner sc = new Scanner(System.in);

      System.out.println("Enter your name :");
      String name = sc.nextLine();
      System.out.println("Your name is " + name);


	  System.out.println("Enter Your lucky No");
	  int num = sc.nextInt();
	  System.out.println("Your lucky no is "+ num);
	}
}