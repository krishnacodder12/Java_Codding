import java.util.Scanner;
public class add {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your num1 : ");
       Double num1 = sc.nextDouble();
       System.out.println("Enter your num2 : ");
       Double num2 = sc.nextDouble();
       Double sum = num1+num2;
       System.out.println("Your sum is : " +sum);
    }
}
