public class connect 
{
    static void manage()
    {
        System.out.println("Manage Startes....");
        System.out.println("Manage Ends....");
    }
    static void connect1()
    {
        System.out.println("Connect Startes....");
        manage();
        System.out.println("Connect Ends....");
    }
    public static void main(String[] args) {
        System.out.println("Program Starts....");
        connect1();
        System.out.println("Program Ends....");
    }
}
