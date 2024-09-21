public class prog7 {
    public static void main(String[] args) {
        String str = "j2ee";
        String str2 = "Krishna";
        String str3 = "Developer";
        String str4 = "    Core    Java     ";
      


        // equals()
        System.out.println(str.equals("J2ee"));//false
        System.out.println(str.equals("j2ee"));//true
        System.out.println(str.equals("adv Java"));//false

        //equalsIgnoreCase()
        System.out.println(str.equalsIgnoreCase("J2ee"));//true
        System.out.println(str.equalsIgnoreCase("j2ee"));//true
        System.out.println(str.equalsIgnoreCase("adv java"));//false

        //toUpperCase()
        System.out.println(str2.toUpperCase());//KRISHNA
        System.out.println(str.toLowerCase());//j2ee

        //substring()

        System.out.println(str3.substring(4));//loper
        System.out.println(str3.substring(6));//per
        System.out.println(str3.substring(3,8));//elope
        System.out.println(str3.substring(0,7));//develop

        // trim()
        System.out.println("----->" + str4.trim() + "<------");//----->Core    Java<------

        //split()

    }
}
