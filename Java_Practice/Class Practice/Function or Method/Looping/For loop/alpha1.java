 public class alpha1 {
    public static void main(String[] args) {
        int n =5;// SIZE OF SQUARE
        char value = 'a';
        for(int i=0; i<n; i++)// NO OF ROWS
        {
            for(int j=0; j<n; j++)// NO OF COLUMNS
            {
                System.out.print(value + " ");
                value++;
            }
            
            System.out.println();//MOVE TO NEW LINE
            value='1';
            
        }
    }
}

    
