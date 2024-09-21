package Conditional_Statement;
import java.util.Scanner;
public class sum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter your num2 : ");
        int num2 = sc.nextInt();
        System.out.println("Enter your num3 : ");
        int num3 = sc.nextInt();
        System.out.println("Enter your num4 : ");
        int num4 = sc.nextInt();
        System.out.println("Enter your num5 : ");
        int num5 = sc.nextInt();

        int sum = num1+num2+num3+num4+num5;
        System.out.println("Sum of the num is " +sum);
        float avg = sum/5;
        System.out.println("The average of sum is " +avg);
    }
}
