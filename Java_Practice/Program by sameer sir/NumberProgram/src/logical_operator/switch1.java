package logical_operator;
import java.util.Scanner;
public class switch1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Num: ");
		int day = sc.nextInt();
		switch(day)
		{
			case 1:
				System.out.println("Monday");
				break;
				
			case 2:
				System.out.println("Tuesday");
				break;
			
			default:
				System.out.println("Invalid input");
		}
	}
}
