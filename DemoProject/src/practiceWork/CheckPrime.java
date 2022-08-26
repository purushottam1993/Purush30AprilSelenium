package practiceWork;
import java.util.Scanner;
public class CheckPrime {
	public static void main(String[] args) {
		int Value=0;
		Scanner ab = new Scanner(System.in);
		System.out.println("enter number");
		int num = ab.nextInt();
		for(int i=2; i<=num-1; i++)
		{
			if(num%i==0)
				Value=Value+1;
		}
		if(Value==0)
			System.out.println("num is prime");
		else 
			System.out.println("num is not prime");
			
	}

}
