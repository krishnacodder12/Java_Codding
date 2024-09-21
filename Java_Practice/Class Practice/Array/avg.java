public class avg {
    public static void main(String[] args) {
        int[] arr ={7500,7200,7300,7250,8000,7300};
        int sum =0;
        
        for(int i=0; i<arr.length; i++)
        {
           sum=sum+arr[i];
        }
        double avg=sum/arr.length;
        System.out.println(avg);
    }
}
