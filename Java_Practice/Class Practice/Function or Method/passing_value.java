public class passing_value {
    static void push(char c)
    {
        System.out.println("The value is : " +c);
    }
    static void play(double d)
    {
        System.out.println("The value is : " +d);
    }
    public static void main(String[] args) {
        System.out.println("Program Started");
        play(3.45);
        push('J');
        System.out.println("Program Ended");
    }
}
