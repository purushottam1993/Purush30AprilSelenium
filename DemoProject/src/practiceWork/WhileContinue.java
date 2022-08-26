package practiceWork;

public class WhileContinue {
	
	public static void main(String[] args) {
		int x = 0;
		while(x<=29) {
		if(x%3==0) {
			x++;
			continue;
		}
		System.out.println("Numbers not div by 3 are: "+x);
		x++;
	}

	}
}
