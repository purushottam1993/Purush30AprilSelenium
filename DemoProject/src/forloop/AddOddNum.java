package forloop;

public class AddOddNum {
	public static void main(String[] args) {
	int sum=1;
	
	for(int i=1; i<=10; i++)
	{
		if(i%2==1)
			System.out.println("Add of Odd num "+sum);
		sum=sum+i;
	}
	}
}
