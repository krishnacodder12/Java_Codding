package Conditional_Statement;
import java.util.Scanner;
//Write a Java program that takes three numbers from the user and prints the greatest number. using if else
public class prob1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your num1 : ");
    int num1 = sc.nextInt();
    System.out.println("Enter Your num2 : ");
    int num2 = sc.nextInt();
    System.out.println("Enter Your num3 : ");
    int num3 = sc.nextInt();
    if(num1>num2 && num1>num3)
    {
        System.out.println(num1 + " is the greatest no");
    }
    else if(num2>num3)
    {
        System.out.println(num2 + " is the greaset no");
    }
    else
    {
        System.out.println(num3 + " is the greatest no");
    }
}
    
}