package Looping;
import java.util.Scanner;
public class WhileProd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Prod No : ");
		int num = sc.nextInt();
		int prod = 1;// prod means multi of each no = 45 = 4*5 = 20
		while(num>0)
		{
			int rem = num%10;
			prod = prod*rem;
			num = num/10;
			
		}
		System.out.println("Sum of Prod No is : "+prod);
		
	}
}
