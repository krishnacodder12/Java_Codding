/*Find the Total price of the car
 * String name ="verma"; int price = 1345000; int cc = 1500; float tax =0; float insurance =0;
 * calculate the tax based on the price of the car
 * price below 10,00,000 ----> 19.5% tax
 * price 10 lakh above to below 20lakh -----> 21.7% tax 16,36,865
 * price 20 lakh above to below 30 lakhs -----> 25.9% tax
 * price 30 lakh and above ------>27% tax 
 * Insurance calculate based on cc
 * cc below 1000 -----> 15% of price
 * cc 1000 and above to below 2000 ---> 17% of price
 * cc 2000 and above to below 3000 ---> 18.2% of price
 * cc 3000 and above -----> 21.5%*/
class car{
    public static void main(String[] args) {
        String carname = "Safari";
        int price = 1345000;
        int  cc = 1500;
        float tax = 0;
        float insurance = 0;
        if(price<10000)
        {
           tax = price*19.5f/100; 
        }
        else if(price>=1000000 && price<2000000)
        {
            tax = price*21.7f/100;
        }
        else if(price>=2000000 && price<3000000)
        {
            tax = price*25.9f/100;
        }
        else if(price>=3000000)
        {
            tax = price*27f/100;
        }
        if (cc<1000)
        {
            insurance = price*15f/100;
        }
        else if(cc>=1000 && cc<2000)
        {
            insurance = price*17f/100;
        }
        else if(cc>=2000 && cc<3000)
        {
            insurance = price*18.2f/100;
        }
        else if(cc>=3000)
        {
            insurance = price*21.5f/100;
        }
        float totalprice = price+tax+insurance;
        System.out.println("Car Brand : " + carname);
        System.out.println("Car price : " + price);
        System.out.println("Tax : " + tax);
        System.out.println("Insurance : " + insurance);
        System.out.println("Total Car price : " + totalprice);
    }
}