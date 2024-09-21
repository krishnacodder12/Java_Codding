public class result5 {
    static boolean verify(int a)
    {
        if(a%2==0)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) 
    {
        System.out.println("Status : " +verify(45));
        System.out.println("Status : " +verify(20));
        System.out.println("Status : " +verify(18));
        System.out.println("Status : " +verify(11));
    }
}
