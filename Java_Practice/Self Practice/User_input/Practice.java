public class Practice
{
    public static void main(String[] args) 
    {
      int balance = 75000;
      int amount = 49000;
      int bankcode =1;
      boolean pancard = false;
      if(amount<=balance)
      {
        if(amount<50000 || pancard==true)
        {
          balance = balance-amount;
          System.out.println("Transaction Successfull " + "Your balance is " + balance);
        }
        else
        {
          System.out.println("Link Pancard");
        }
            if(bankcode==1)
            {
              if(balance<10000)
              {
                System.out.println(10000-balance + " Must be deposite in account");
              }
            }
            if(bankcode==2)
            {
              if(balance<5000)
              {
                System.out.println(5000-balance + " Must be deposite in account");
              }
            }
            if(bankcode==3)
            {
              System.out.println("Congratulations");
            }
            if(bankcode==4)
            {
              System.out.println("Congratulations");
            }   
      
    }
      else
      {
        System.out.println("Low Balance");
      }
    }
}
