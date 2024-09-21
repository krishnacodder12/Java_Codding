/* Calculate total price 
 * Where p1 =1299; p2=4299; p3=899; p4=599;
 * min get 10% discount
 * any puchase 2000 and above to below 3000 ----> get 20% discount
 * any puchase 3000 and above to below 4000 ----> get 25% discount
 * any puchase 4000 and above to below 5000 ----> get 30% discount
 * any puchase 2000 and above ----> get 40% discount
 * after total price need to give information about all the dis.
 */

public class purchase {
    public static void main(String[] args) {
        int p1 = 1299;
        int p2 = 4299;
        int p3 = 899;
        int p4 = 599;
        float discount = 0;
        int totalprice = p1+p2+p3+p4;
        if(totalprice<2000)
        {
           discount = totalprice*10f/100;
           System.out.println(2000-totalprice + "Must purchase to get 20%");
           System.out.println(3000-totalprice + "Must purchase to get 25%");
           System.out.println(4000-totalprice + "Must purchase to get 30%");
           System.out.println(5000-totalprice + "Must purchase to get 40%");
        }
        else if(totalprice>=2000 && totalprice<3000)
        {
            discount = totalprice*20f/100;
            System.out.println(3000-totalprice + "Must purchase to get 25%");
           System.out.println(4000-totalprice + "Must purchase to get 30%");
           System.out.println(5000-totalprice + "Must purchase to get 40%");
        }
        else if(totalprice>=3000 && totalprice<4000)
        {
            discount = totalprice*25f/100;
           System.out.println(4000-totalprice + "Must purchase to get 30%");
           System.out.println(5000-totalprice + "Must purchase to get 40%");
        }
        else if(totalprice>=4000 && totalprice<5000)
        {
            discount = totalprice*30f/100;
           System.out.println(5000-totalprice + "Must purchase to get 40%");
        }
        else if(totalprice>=5000)
        {
            discount = totalprice*40f/100;

        }
        float grandtotal = totalprice-discount;
        System.out.println("Your Discount : " + discount);
        System.out.println("Your Totalprice : " + totalprice);
        System.out.println("Your grandtotal price : " + grandtotal);
        
    }
    
}