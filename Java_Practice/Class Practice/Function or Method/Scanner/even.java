import java.util.Scanner;//1
public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//2
        System.out.println("Enetr Your Value : ");
        int value = sc.nextInt();//3
        if(value%2==0)
        {
            System.out.println("Even No");
        }
        else{
            System.out.println("Odd No");
        }
    }
}
