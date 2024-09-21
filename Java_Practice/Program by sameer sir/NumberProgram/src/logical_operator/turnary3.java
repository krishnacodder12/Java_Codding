package logical_operator;
import java.util.Scanner;
public class turnary3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter your 1st no :");
	int a = sc.nextInt();
	System.out.println("Enter your 2nd no :");
	int b = sc.nextInt();
	System.out.println("Enter your 3rd no :");
	int c = sc.nextInt();
	System.out.println("Enter your 4th no :");
	int d = sc.nextInt();
	int big = (a>b && a>c && a>d)?a : (b>c && b>d)?b : (c>d)?c:d;
	System.out.println(big+ " is the biggest no");
}
}
