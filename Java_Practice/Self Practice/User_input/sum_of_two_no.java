import java.util.Scanner;
public class sum_of_two_no {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Your First No :");
        int num1 = sc.nextInt();

        System.out.println("Enter Your Second No :");
        int num2 = sc.nextInt();

        int sum = num1+num2;
        System.out.println("Sum is: " +sum);
    }
}
