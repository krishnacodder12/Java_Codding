public class peog5 {

        public static void main(String[] args) {
            String str = "Developer";
            System.out.println(str.lastIndexOf('p'));
            System.out.println(str.indexOf('o'));
            System.out.println(str.indexOf('n'));
            System.out.println(str.indexOf('e'));
    
            //1st Occurance
            int x = str.lastIndexOf('e');
            //2nd Occurance
            int y= str.lastIndexOf('e', x-1);
            //3rd Occurane
            int z = str.lastIndexOf('e', y-1);
    
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
        }
    }
    
