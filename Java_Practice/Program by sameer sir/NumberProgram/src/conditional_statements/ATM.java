package conditional_statements;
import java.util.Scanner;
public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pin = 1234;
		double bal = 20000;
		
		System.out.println("Enter your Pin : ");
		int entered_pin = sc.nextInt();
		
		if(pin==entered_pin)
		{
			System.out.println("Your pin is correct");
			
			System.out.println("Enter Withraw Amount : ");
			double amt = sc.nextDouble();
			
			if(amt<=bal)
			{
				bal = bal-amt;
				System.out.println("Transaction Successefull" + "\n Withraw Amount is : " +amt);
				System.out.println("Your Remaining Balance is : " +bal);
			}
			else {
				System.out.println("Insufficient Balance");
			}
		}
		else {
			System.out.println("incorrect pin");
		}
		
	}	

}
