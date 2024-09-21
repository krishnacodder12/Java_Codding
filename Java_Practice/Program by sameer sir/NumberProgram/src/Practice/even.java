package Practice;

public class even {
	public static void main(String[] args) {
		int sum = 0;
		int n = 200;
		for(int i=1; i<=n; i++)
		{
			int rem = n%10;
			if(rem%2==0)
			{
				sum = sum+rem;
				
			}
			n = n/10;
		}
		if(sum%2==0) {
			System.out.println("sum of even is : " +sum);
		}
	}
}
