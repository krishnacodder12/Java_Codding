package conditional_statements;

public class If2 {
	public static void main(String[] args) {
		int a = 10, b = 20;
		int big = a;
		if(b>big)
			big = b;
		System.out.println("big is a biggest no"  +big);
	}
}
