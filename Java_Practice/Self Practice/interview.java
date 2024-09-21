public class interview {
    public static void main(String[] args) {
        int qcode =2;
        int scode =7;
        float per = 54;
        int yop = 2021;
        if(per<55)
        {
            System.out.println("Your Percentage is less than company expectations");
            System.out.println("You are not eligible for interview");
        }
            if(yop<2022 || yop>=2025)
            {
                System.out.println("Your passout year is not matching");
                System.out.println("You are note eligible for interview");
            }       
                
                if(scode==1 || scode==2 || scode==6)
                {
                    if(qcode==1 || qcode==4)
                    {
                        System.out.println("Congratulation You are elgible for interview");
                    }
                    else
                    {
                        System.out.println("your qualification is not matching");
                        System.out.println("You are not eligible for interview");
                    }
                }
                else
                {
                    System.out.println("Your stream is not matching");
                    System.out.println("You are not eligible for interview");
                }
    
    }
}
