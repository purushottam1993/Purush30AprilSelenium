package practiceWork;

public class ChildCon extends ParentCon{
	public ChildCon()
	{
		super(44);
		System.out.println("Child Class Constructor");
	}
	public static void main(String[] args) {
	    new ChildCon();
	}
}
