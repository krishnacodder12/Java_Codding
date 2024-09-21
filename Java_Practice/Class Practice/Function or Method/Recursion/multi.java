package Recursion;

public class multi {
    static void multi2(int a)
    {
        System.out.println(a);
        if(a<210)
        {
            a = a+21;
            multi2(a);
        }
    }
    public static void main(String[] args)
    {
        multi2(21);
    }
}
