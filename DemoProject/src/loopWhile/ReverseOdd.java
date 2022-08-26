package loopWhile;

public class ReverseOdd {
	public static void main(String[] args) {
		int a =100;
		while(a>=1)
		{
			if(!(a%2==0))
				System.out.println("Reverse odd num's-"+a);
			a--;
		}
	}

}
