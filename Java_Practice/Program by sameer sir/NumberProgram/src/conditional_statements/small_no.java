package conditional_statements;
import java.util.Scanner;
public class small_no {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter your 1st number");
	int a = sc.nextInt();
	System.out.println("Enter your 2nd number");
	int b = sc.nextInt();
	System.out.println("Enter your 3rd number");
	int c = sc.nextInt();
	if(a<b && a<c)
	{ 
		System.out.println(a + " is smallest");
	}
	else if(b<c)
	{
		System.out.println(b + " is smallest");
	}
	else {
		System.out.println(c + " is smallest");
	}
}
}
