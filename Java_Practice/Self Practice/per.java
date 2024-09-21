
public class per {
    public static void main(String[] args) {
        int p1 = 2500;
        int p2 = 250;
        int p3 = 750;
        int p4 = 750;
        float dis = 0;
        int totalprice = p1+p2+p3+p4;
        if(totalprice<2000)
        {
            dis = totalprice*10f/100;
            System.out.println(2000-totalprice + " Must purchase to get 20% dis");
            System.out.println(3000-totalprice + " Must purchase to get 25% dis");
            System.out.println(4000-totalprice + " Must purchase to get 30% dis");
            System.out.println(5000-totalprice + " Must purchase to get 40% dis");
        }
        else if(totalprice>=2000 && totalprice<3000)
        {
            dis = totalprice*20f/100;
            System.out.println(3000-totalprice + " Must purchase to get 25% dis");
            System.out.println(4000-totalprice + " Must purchase to get 30% dis");
            System.out.println(5000-totalprice + " Must purchase to get 40% dis");
        }
        else if(totalprice>=3000 && totalprice<4000)
        {
            dis = totalprice*25f/100;
            System.out.println(4000-totalprice + " Must purchase to get 30% dis");
            System.out.println(5000-totalprice + " Must purchase to get 40% dis");
        }
        else if(totalprice>=4000 && totalprice<5000)
        {
            dis = totalprice*30f/100;
            System.out.println(5000-totalprice + " Must purchase to get 40% dis");
        }
        else if(totalprice>=5000)
        {
            dis = totalprice*40f/100;
            System.out.println(" Thanks For Visit");
        }
        
        float grandtotal=totalprice-dis;
        System.out.println(totalprice);
        System.out.println(dis);
        System.out.println(grandtotal);


        
    }
    
}