public class passing_value2 {
    static void test(int arg)
        {
            System.out.println("the value is " + arg);
        }
        
        public static void main(String[] args) {
            System.out.println("Program Starts");
            test(200);
            test(2005);
            test(500);
            System.out.println("Program Ends");
        }
}
