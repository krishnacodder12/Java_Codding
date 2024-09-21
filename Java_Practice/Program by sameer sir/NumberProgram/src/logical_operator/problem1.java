package logical_operator;

public class problem1 {
	public static void main(String[] args) {
		int no = 15;
		if(no%3==0 && no%5==0)
		{
			System.out.println("Sanju Weds Geeta");
		}
		else if(no%3==0)
		{
			System.out.println("Sanju");
		}
		else if(no%5==0)
		{
			System.out.println("Geeta");
		}
		else
		{
			System.out.println("Break-up");
		}
		
		
	}
}
