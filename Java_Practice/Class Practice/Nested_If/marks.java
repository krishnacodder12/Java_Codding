// A student has following marks
//  P=76; C=66  M=84, O= 82
//print total percentage.
//  if percentage is below 35 print fail
//  if percentage is above 35 and below 60 print 2nd class
//  if percentage is above 60 and below 80 print 1st class
//  id percentage is 80 and above print Distinction

public class marks {
    public static void main(String[] args) {
        int p = 76;
        int c = 66;
        int m = 84;
        int o = 82;
        int total = p+c+m+o;
        float percentage = (total/400f)*100;
        System.out.println(percentage);
        if(percentage<35)
        {
            System.out.println("Fail");
        }
        if(percentage>=35)
        {
            if(percentage<60)
            {
                System.out.println("2nd Class");
            }
        }
        if(percentage>=60)
        {
            if(percentage<80)
            {
                System.out.println("1st Class");
            }
        }
        if(percentage>80)
        {
            System.out.println("Distinction");
        }
    }
}
