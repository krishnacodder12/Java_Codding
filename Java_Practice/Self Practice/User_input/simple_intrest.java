import java.util.Scanner;

public class simple_intrest
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter your Principal");
        float p1 = sc.nextFloat();

        System.out.println("Enter your rate of intrest");
        float r1 = sc.nextFloat();

        System.out.println("Enter your time");
        float t1 = sc.nextFloat();

        float intrest = (p1*r1*t1)/100;

        System.out.println("Principal is: " +p1);
        System.out.println("rate of intrest is: " +r1);
        System.out.println("Time is: " +t1);

        System.out.println("Your total intrest is:" +intrest);
    }
}
