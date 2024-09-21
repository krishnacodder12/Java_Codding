package Looping;

public class prime {
	public static void main(String[] args) {
	int prime = 50;
	for(int i=1; i<prime; i++)
	{
		if(i%prime==0 && i%1==0)
		{
			System.out.println("Prime No is : " +i);
		}
	}
}
}
