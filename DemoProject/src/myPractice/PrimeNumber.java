package myPractice;

public class PrimeNumber {
	public static void main(String[] args) {
		for(int i=1; i<=45; i++)
		{
			int value =0;
			for(int j=2; j<i; j++)
			if(i%j==0)
				value = value+1;
			if(value==0)
				System.out.println(i);
	}
	}
}
