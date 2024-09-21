package Conditional_Statement;
//Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.
import java.util.Scanner;
public class same {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your floating num1 : ");
        double dec1 = sc.nextDouble();
        System.out.println("Enter your floating num2 : ");
        double dec2 = sc.nextDouble();
        int num1 = (int)(dec1*1000);
        int num2= (int)(dec2*1000);
        if(num1==num2)
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("Invalid");
        }

    }
}
