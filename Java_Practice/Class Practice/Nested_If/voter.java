public class voter {
    public static void main(String[] args) {
      int age = 19;
      boolean voterid = false;
      if(age>=18){
        if(voterid==true){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("Not eligible for voting");
            System.out.println("No Voterid");
        }
      }
    else{
        System.out.println("Not Eligible for voting");
    }  
    }
    
}