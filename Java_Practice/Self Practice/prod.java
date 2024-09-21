public class prod {
    public static void main(String[] args) {
        int p1 = 1299;
        int p2 = 299;
        int p3 = 499;
        int p4 = 599;
        int total = p1+p2+p3+p4;
        System.out.println(total);
        float dis = total*25/100f;
        System.out.println(dis);
        float grandtotal = total - dis;
        System.out.println(grandtotal);
    }
}

