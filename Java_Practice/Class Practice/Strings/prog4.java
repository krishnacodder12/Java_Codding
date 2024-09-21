public class prog4 {
    public static void main(String[] args) {
        String str = "Developer";
        System.out.println(str.indexOf('v'));
        System.out.println(str.indexOf('l'));
        System.out.println(str.indexOf('h'));
        System.out.println(str.indexOf('o'));

        //1st Occurance
        int a = str.indexOf('e');
        //2nd Occurance
        int b = str.indexOf('e', a+1);
        //3rd Occurane
        int c = str.indexOf('e', b+1);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
