package loopWhile;

public class BreakCheck {
	public static void main(String[] args) {
		int x =0;
		while(x<=5)
		{
			if(x==3)
				break;
			System.out.println("number's are: "+x);
			x++;
		}
	}

}
