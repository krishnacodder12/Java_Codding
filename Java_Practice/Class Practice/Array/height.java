public class height {
    public static void main(String[] args) {
        double[] height = {5.8,5.7,5.4,6.3,4.9};
        double small = height[0];
        for(int i=0; i<height.length; i++)
        {
            if(height[i]<small)
            {
                small = height[i];
            }
        }
        System.out.println("Smallest no : " +small);
    }
    
}
