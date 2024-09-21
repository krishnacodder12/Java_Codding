public class return1 
{
    static int test()
    {
        return 10;
    }
    public static void main(String[] args) 
    {
        int var = test();
        System.out.println("The Value is " + var);
        System.out.println("The Value is " + test());
    }
}
