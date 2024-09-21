package Looping;
import java.util.Scanner;
public class WhileSpy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your num : ");
		int num = sc.nextInt();
		int sum = 0;
		int prod = 1;
		while(num>0)
		{
			int rem = num%10;
			sum = sum+rem;
			prod = prod*rem;
			num = num/10;
		}
		if(sum==prod)// spy means sum and prod/mult of the number should be same.
		{
			System.out.println("Spy No ");
		}
		else {
			System.out.println("Not a spy no");
		}
	}
}
