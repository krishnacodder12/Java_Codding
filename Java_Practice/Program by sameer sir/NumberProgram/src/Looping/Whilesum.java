package Looping;
import java.util.Scanner;
public class Whilesum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int sum = 0;
		System.out.println("Enter Your Number : ");
		int n = sc.nextInt();
		while(n>0)
		{
			int rem = n%10;
			sum = sum+rem;
			n = n/10;
		}
		System.out.println(sum);		
	}
}
