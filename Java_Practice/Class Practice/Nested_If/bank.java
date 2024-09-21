// BankCode   Bank        Min-bal
//    1       HDFC        10000
//    2       AXIS        5000
//    3       SBI         0
//    4       CANARA      0 

// Need to withrow
    // balance = 75000;
   // amount = 73000;
   // bankcode = 1;
  //  Pancard = true;
//for ony withraw 50000 and above pancard is mandatory if not print "link poncard"

// for any withraw below 50000 pancard is not mandatory.

//afters withrawing the amount, minimum balance has to be maintained according to the bank code, if print "Low minimum balance"

//also specify how much to be deposited as min-balance to maintain

public class bank {
    public static void main(String[] args) 
    {
        int balance = 75000;
        int amount = 66000;
        int bankcode = 1;
        boolean pancard = true;
        if(amount<=balance)//Check The Amount
        {
            if(amount<50000 || pancard==true)//Check for withraw
            {
                balance = balance-amount;//Withraw Amount
                System.out.println("Your balance is " + balance + " Transaction Successfull");
                //Check The Low Min-balance
                if(bankcode==1)//HDFC
                {
                    if(balance<10000)
                    {
                        System.out.println("Low Minimum Balance");
                        System.out.println(10000-balance + " Must Be Deposited In HDFC");
                    }
                }
                if(bankcode==2)//AXIS
                {
                    if(balance<5000)
                    {
                        System.out.println("Low Minimum Balance");
                        System.out.println(5000-balance + "Must Be Deposited In AXIS");
                    }
                }
                if(bankcode==3)//SBI
                {
                    if(balance<0)
                    {
                        System.out.println(0-balance + "Must Be Deposited");
                    }
                }
                if(bankcode==4)//CANARA
                {
                    if(balance<10000)
                    {
                        System.out.println(0-balance + "Must Be Deposited");
                    }
                }
            }
            else 
            {
                System.out.println("Link-Pancard");
            }
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
    
}