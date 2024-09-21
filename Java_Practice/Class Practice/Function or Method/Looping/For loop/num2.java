public class num2 {
    public static void main(String[] args) {
        int n =5;// SIZE OF SQUARE
        int value = 1;
        for(int i=0; i<n; i++)// NO OF ROWS
        {
            for(int j=0; j<n; j++)// NO OF COLUMNS
            {
                System.out.print(value + " ");
                value++;
            }
            
            System.out.println();//MOVE TO NEW LINE
            value=1;
            
        }
    }
}

    
