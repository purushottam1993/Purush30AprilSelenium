package constCheckInhert;

public class ChildConst extends ParentConst{
	public ChildConst(int a)
	{
		super(88);
		System.out.println("sun");
	}
	public static void main(String[] args) 
	{
		new ChildConst(55);
		
	}

}
