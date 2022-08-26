package overrideMainMethod;

public class ChildClass extends ParentClass{
	
	public static void main(String[] args)
	{
		main(args);
		System.out.println("Child Main");
	}

}
