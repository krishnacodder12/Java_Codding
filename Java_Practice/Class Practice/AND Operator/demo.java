public class demo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = a*b/a-b; // this is wrong format because 10*5/10-5 = 50/10-5 = 5-5 = 0
        int d = (a*b)/(a-b);// this is right format (10*5)/(10-5) = 50/5 = 10 Ans
        System.out.println(c);
        System.out.println(d);
    }
}
