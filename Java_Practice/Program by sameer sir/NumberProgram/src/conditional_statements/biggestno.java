package conditional_statements;

public class biggestno {
	public static void main(String[] args) {
		int x =125, y=95, z=125;
		int big =x;
		if(y>big)
		{
			big = y;
		}
		if(z>big)
		{
			big = z;
		}
		System.out.println("biggest no is : " +big);
	}
}
