package myPractice;

public class AdditionOfInt {
	public static void main(String[] args)
	{
		int sum=0;int a=0,b=1;int c;
		for(int i=1; i<=100; i++)
		{
			c=a+b;
		System.out.println(sum);
		 sum=sum+i;
		 a=b;
		 b=c;
		}
		System.out.println(sum);
		}
	  }
