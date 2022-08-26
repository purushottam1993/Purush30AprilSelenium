package loopWhile;

public class EvenNum {
	public static void main(String[] args) {
		int x = 1;
		while(x<=100)
			{
			if(x%2!=0)
			{
			x++;
			continue;
			}
		System.out.println("Even num's are "+x);
		x++;
		
	}
	}
}
