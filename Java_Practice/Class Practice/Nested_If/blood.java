/*Use the first if statement to check if the person is above 18 years of age.
   - If the person is above 18 years of age then use another if statement to check if the weight of the person is above 50 or not.
   - If the person's age is above 18 and weight is also above 50 then, print the message that the person is eligible to donate blood.
   - If the person is above 18 years of age but his/her weight is below 50 then print the message that the person is not eligible to donate blood.
   - If the person is below 18 years of age, then print the message that the age must be greater than 18.
Display the result. */

public class blood {
    public static void main(String[] args) {
        int age = 45;
        int weight = 55;
        if(age<18 || weight<50)
        {
            System.out.println("You are not eligible to donate blood");
            if(age<18)
            {
                System.out.println("age must be 18 or above");
            }
            if(weight<50)
            {
                System.out.println("weight must be 50kg or above");
            }
            
        }
        if(age>=18)
        {
            if(weight>=50)
            {
                System.out.println("You are eligible to donate blood");
            }
        }
    }
    
}