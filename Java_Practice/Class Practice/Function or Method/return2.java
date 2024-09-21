public class return2 
{
    static char play()
    {
        return 'J';
    }
    static double disp()
    {
        return 4.5;
    }
    public static void main(String[] args) 
    {
        double num = disp();
        System.out.println("Returned value " +num);
        System.out.println("Returned value " +disp());

        char ch = play();
        System.out.println("Returned value : " +ch);
    }
}
