package Recursion;

public class assending 
{
    static void assending1(int a)
    {
        System.out.println(a);
        if(a<=5)
        {
        a++;
        assending1(a);
        }
    }
    public static void main(String[] args) 
    {
        assending1(1);
    }
}
