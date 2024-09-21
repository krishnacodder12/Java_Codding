package Looping;

public class factor {
	public static void main(String[] args) {
		int n = 58;
		for(int i=1; i<=n/2; i++)
		{
			if(n%i==0)
			System.out.println(i);
		}
		System.out.println(n);
	}
}
