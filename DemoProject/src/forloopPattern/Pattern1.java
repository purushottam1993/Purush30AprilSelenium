package forloopPattern;

public class Pattern1 {
	public static void main(String[] args) {
		for (int i=1; i<=5; i++)
		{
		for (int j=1; j<=i; j++)
		{
		System.out.print("* ");
	}
		System.out.println(" ");
		}
		for(int k=6; k<=9; k++)
		{
		for(int l=9; l>=k; l--)
		{
		System.out.print("* ");
		}
	 System.out.println(" ");
	}
	}
}
