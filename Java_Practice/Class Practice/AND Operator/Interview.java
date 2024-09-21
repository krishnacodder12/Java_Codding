/*
 *      Qualification (Q code)          Stream  (S code)
 *      BE/B.Tech       1               CS          1
 *      ME/M.Tech       2               IS          2
 *      BCA             3               IT          3
 *      MCA             4               MEC         4
 *      BSC             5               CIV         5
 *      MSC             6               EC          6
 *      Oth             7               EE          7
 *                                      Oth         8
 * Check if the person is eligible for interview or not
 *      Company       : Abhishek Software Solution
 *      Qualification : BE,MCA
 *      Stream        : CS,IS,EC
 *      YOP           : 2022, 2023, 2024
 *      Perc          : 55%
 *      Salary        : 3-5lpa
 *      Bond          : 12month
 *      Location      : Banglore
 * && yop==2022 || yop==2023 || yop==2024 && qcode==1 || qcode==4 && 
 */
public class Interview {
    public static void main(String[] args) {
        int yop = 2026;
        int perc = 55;
        int qcode = 1;
        int scode = 7;
        if((yop==2022 || yop==2024) && (perc>=55) && (qcode==1 || qcode==4) && (scode==1 || scode==2 || scode==6))
        {
            System.out.println("You are eligible for interview");
        }
        else
        {
            System.out.println("You are not eligible for interview");
        }
            if (perc<55)
            {
                System.out.println("Your percentage is not matching");
            }
            if(qcode!=1 && qcode!=4)
            {
                System.out.println("Your Qualification is not matching");
            }
            if (scode!=1 && scode!=2 && scode!=6)
            {
                System.out.println("Your Stream is not matching");
            }
            if (yop<2022 || yop>2024)
            {
                System.out.println("Your yop is not matching");
            }

        }
    }
