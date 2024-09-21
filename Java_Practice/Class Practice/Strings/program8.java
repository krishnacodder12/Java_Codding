public class program8 {
    public static void main(String[] args) {
        String str = "Java is an Object Oriented Programming Language";
        String[] arr = str.split(" "); //{"Java", "is", "an", "Object", "Oriented", "Programming", "Language"};
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }
}
