
public class prog6 {
    public static void main(String[] args) {
        String str = "Engineering";

        System.out.println(str.contains("jon")); //false
        System.out.println(str.contains("gin"));//true

        System.out.println(str.startsWith("eng"));//false
        System.out.println(str.startsWith("Eng"));//true

        System.out.println(str.endsWith("i ng"));//false
        System.out.println(str.endsWith("ring"));//true
    }
    
}