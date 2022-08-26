package myPractice;

public class SumOfIntOfNum {
	public static void main(String[] args)
	{
		int num =1234; int rem=0;
		int sum=0;
		while(num>0)
		{
			rem=num%10;
			sum+=rem;
			num=num/10;
		}
		System.out.println(sum);
	}

}
