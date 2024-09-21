package Practice;
public class big {
	public static void main(String[] args) {
		int a=30, b=25, c=85, d=10;
		int big = (a>b && a>c && a>d)?a : (b>c && b>d)?b : (c>d)?c:d;
		System.out.println(big);
	}
}
