package inheritanceSimAndHierarchical;

public class ChildClass extends ParentClass
    {
	 int a =20;
	public void m4()
	{
		System.out.println("m4 is method of Child");
		System.out.println(super.a);
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		ChildClass obj = new ChildClass();
		obj.m1();
		obj.m4();
		    m3();
		obj.m2();
		System.out.println(obj.a);
	}

}
