package myPractice;

public class ReverseNum {
	public static void main(String[] args) {
		int num=1234;
		int rev=0; int rem=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;//4,43,432,4321
			num=num/10;
		}
		System.out.println("Reverse of Num is: "+rev);
	}

}
