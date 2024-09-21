package logical_operator;
import java.util.Scanner;
public class turnary1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your 1st no: ");
	int a = sc.nextInt();
	System.out.println("Enter your 1st no: ");
	int b = sc.nextInt();
	int big = (a>b)?a:b;
	System.out.println(big + " is big");
}
}
