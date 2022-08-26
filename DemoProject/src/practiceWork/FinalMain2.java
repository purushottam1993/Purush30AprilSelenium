package practiceWork;

public class FinalMain2 extends  FinalMain{
	public void m1(char b)
	{
		System.out.println("Hidden Value");
	}
	public static void main(String[] args) {
		FinalMain2 ob	= new FinalMain2();
		ob.m1();
		ob.m1(0);
		ob.m1('@');
	}

}
