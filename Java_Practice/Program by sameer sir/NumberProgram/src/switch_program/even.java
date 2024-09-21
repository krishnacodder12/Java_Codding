package switch_program;

public class even {
	public static void main(String[] args) {
		int n = 11;
		
		switch(n%2)
		{
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
		
		}
	}
}
