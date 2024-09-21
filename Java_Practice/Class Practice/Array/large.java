public class large {
    public static void main(String[] args) {
        int[] arr ={12,14,11,17,16};
        int large = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]>large){
            large = arr[i];
            }
        }
        System.out.println("largest value is : "+large);
    }
}
