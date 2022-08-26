package myPractice;
import java.util.Scanner;
public class CheckPrime {
	public static void main(String[] args)
    {
    Scanner S = new Scanner(System.in);
    System.out.println("enter any number");
    int num = S.nextInt();
    int temp=0;
    for(int i=2; i<=(num-1); i++)
    {
    	if(num%i==0)
    		temp=temp+1;
    }
    if(temp==0)
    {
    	System.out.println("number is prime");
    }
    else
    	System.out.println("number is not prime");
}

}
