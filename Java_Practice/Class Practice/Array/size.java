import java.util.Scanner;
public class size {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter Your Values ");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Values are");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
