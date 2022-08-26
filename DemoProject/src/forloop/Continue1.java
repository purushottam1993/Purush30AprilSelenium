package forloop;

public class Continue1 {
	public static void main(String[] args) {
		for(int i=1; i<=7; i++)
		{
	        if(i==4)
			continue;
			System.out.println("num's are: "+i);
		}
		System.out.println("exit loop");
	}

}
