package conditional_statements;
import java.util.Scanner;
public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your Amount : ");
		double amt = sc.nextDouble();
		
		double bal = 10000.00;
			
		if(amt<=bal)
		{
			bal = bal-amt;
			System.out.println("Transaction Successfull");
			System.out.println("Your Balance Is : " +bal);
		}
		else {
			System.out.println("Insufficient Balance");
			System.out.println("Your Balance is : " +bal + " Only");
		}
	}

}
