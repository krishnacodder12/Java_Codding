package Recursion;

public class dessending 
{
    static void dessending1(int a)
    {
        System.out.println(a);
        if(a>0){
            a--;
            dessending1(a);
        }
    }
    public static void main(String[] args) 
    {
        dessending1(5);
    }
}
