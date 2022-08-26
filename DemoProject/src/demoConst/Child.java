package demoConst;

public class Child extends Parent {
	public Child()
	{
		this(false);
		System.out.println("child chalega");
	}
	public Child(boolean f)
	{
		super(88);
		System.out.println("True value");
	}
	public static void main(String[] args) {
		new Child();
	}

}
