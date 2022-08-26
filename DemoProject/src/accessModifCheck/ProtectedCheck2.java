package accessModifCheck;

public class ProtectedCheck2 extends ProtectedCheck1 {
	public void k2()
	{
		System.out.println("k2 is public method");
	}
	public static void main(String[] args)
	{
		ProtectedCheck2 kk0 = new ProtectedCheck2();
		kk0.k1();
		kk0.k2();
	}

}
