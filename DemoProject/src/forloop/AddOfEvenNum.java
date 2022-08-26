package forloop;

public class AddOfEvenNum {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=15; i++)
		{
		   if(i%2==0)
		   {
			   System.out.println("sum of Even Num: "+sum);
			  sum=sum+i;
		   }
		}
		}
}
	
