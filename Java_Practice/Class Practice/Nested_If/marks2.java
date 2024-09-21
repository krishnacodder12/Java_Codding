//Use an if-else-if statement to determine the grades obtained from the entered marks.
/*If marks are less than 50, print as fail.
Else if marks lie between 50 to 60, print as a D grade.
Else if marks lie between 60 to 70, print as a C grade.
Else if marks lie between 70 to 80, print as B grade.
Else if marks lie between 80 to 90, print as an A grade.
Else if marks lie between 90 to 100, print as an A+ grade.
Else print as an invalid.*/
public class marks2 {
    public static void main(String[] args) {
        int marks=65;
        System.out.println(marks);
        if(marks<50)
        {
            System.out.println("fail");
        }
            if(marks>50)
            {
                if(marks<=60)
                {
                    System.out.println("D Grade");
                }
                
            }
            if(marks>60)
            {
                if(marks<=70)
                {
                    System.out.println("C Grade");
                }
                
            }
            if(marks>70)
            {
                if(marks<=80)
                {
                    System.out.println("B Grade");
                }
                
            }
            if(marks>80)
            {
                if(marks<=90)
                {
                    System.out.println("A Grade");
                }
                
            }        
            if(marks>90)
            {
                if(marks<=100)
                {
                    System.out.println("A+ Grade");
                }
                
            }
            if(marks>100)
            {
                System.out.println("Invalid");
            }       

        
    }
}
