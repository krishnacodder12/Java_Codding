// A person has purchased 4 product and the prizes are given below :- 
// p1 = 1299, p2 = 299, p3 = 499, p4 = 599. calculate the total prize andd update the prize with 25% discount.

public class product {
    public static void main(String[] args) {
        int p1 = 1299;
        int p2 = 299;
        int p3 = 499;
        int p4 = 599;
        int total = p1+p2+p3+p4;
        System.out.println(total);
        int dis = (total*25/100);
        System.out.println(dis);
        total = total - dis;
        System.out.println(total); 



    }
    
}