public class search {
    public static void main(String[] args) {
        int[] arr ={13,11,14,16,15,11,17};
        int value = 22;
        boolean chance = false;
        for(int i=0; i<arr.length; i++)
        {
            if(value==arr[i])
            {
                System.out.println(value + " Founded at index " +i);
                chance = true;
            }
        }
        if(chance==false)
        {
            System.out.println(value+ " Not found in Array");
        }
    }
}
