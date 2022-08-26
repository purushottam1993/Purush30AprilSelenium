package forloop;

public class ContinueCheck {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++)
		{
			if(i%2==1)
				continue;
				System.out.println("even num's are "+i);
		}
	}

}
