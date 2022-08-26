package accessModifCheck;

public class DefaultCheck2 extends DefaultCheck1{
	public void f2()
	{
		System.out.println("integer");
	}
	public static void main(String[] args) {
		DefaultCheck2 ff0 = new DefaultCheck2();
		ff0.f1();
		ff0.f2();
	}

}
