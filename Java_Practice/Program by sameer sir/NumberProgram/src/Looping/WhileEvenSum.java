package Looping;
import java.util.Scanner;
public class WhileEvenSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Num : ");
		int n = sc.nextInt();
		int sum = 0;
		int count = 0;
		while(n>0)
		{
			int rem = n%10;
			if(rem%2==0)
			{
				count = count+1;
				sum = sum+rem;
			}
			n=n/10;
		}
		System.out.println("Even Numbers Are:" +count);
		System.out.println("Sum of Even is : "+sum);
		if(sum%2==0)
		{
			System.out.println("Even No");
		}
		else {
			System.out.println("Odd Num");
		}
		
	}

}
