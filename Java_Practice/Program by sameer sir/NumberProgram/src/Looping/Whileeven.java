package Looping;
import java.util.Scanner;
public class Whileeven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int n = sc.nextInt();
		int count =0;
		while(n>0)
		{
			int rem = n%10;
			if(rem%2==0)
			{
				count++;
				
			}
			n = n/10;
			
		}
		System.out.println("Even no is : " +count);
	}
}
