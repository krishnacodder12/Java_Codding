package logical_operator;
import java.util.Scanner;
public class turnary2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your 1st no");
		int a = sc.nextInt();
		System.out.println("Enter your 2nd no");
		int b = sc.nextInt();
		System.out.println("Enter your 3rd no");
		int c = sc.nextInt();
		int small = (a<b && a<c)?a:(b<c)?b:c;
		System.out.println(small+ " is Smallest no");
	}
}
