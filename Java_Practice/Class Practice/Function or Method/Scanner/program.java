import java.util.Scanner;
public class program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer value:");
        int num = sc.nextInt();

        System.out.println("Enter Double value: ");
        double  dec = sc.nextDouble();

        System.out.println("Enter Boolean value: ");
        boolean cond = sc.nextBoolean();

        System.out.println("Integer value : " +num);
        System.out.println("Double value : " +dec);
        System.out.println("Boolean value : " + cond);
    }
}
