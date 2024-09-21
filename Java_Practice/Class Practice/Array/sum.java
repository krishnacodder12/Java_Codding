public class sum {
    public static void main(String[] args) {
        int[] arr ={12,10,15,16,13};
        int sum =0;
        for(int i=0; i<arr.length; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("Sum : "+sum);
    }
    
}
