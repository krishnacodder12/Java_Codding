package Practice;

public class leap {
	public static void main(String[] args) {
		int n = 2500;
		int count = 0;
		for(int i=2000; i<=n; i++)
		{
			if(i%4==0 && i%100!=0)
			{
				System.out.println(i);
				count =count +1;
			}
			else if (i%400==0)
			{
				System.out.println(i);
				count = count+1;
			}
		}
		System.out.println("Total leap year is : "+count);
		}
	
		
		
	}

