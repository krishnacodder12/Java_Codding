package Looping;
import java.util.Scanner;
public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your num to factorial : ");
		int num = sc.nextInt();
		int fact =1;
		for(int i=2; i<=num; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of "+num+ " is " +fact);
	}
}
