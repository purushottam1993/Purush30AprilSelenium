package inheritanceSimAndHierarchical;

public class ChildClass1 extends ChildClass
    {
	public void m5()
	{
		System.out.println("m5 is method of child1");
		System.out.println(super.a);
		
	}
	public static void N1()
	{
		ParentClass ob = new ChildClass1();
		System.out.println(ob.a);
		System.out.println("N1 is Static method");
	}
	public static void main(String[] args)
	{
		ChildClass1 ch1obj = new ChildClass1();
		ch1obj.m5();
		ch1obj.m1();
		ch1obj.m2();
		       m3();
	ChildClass ch = new ChildClass();
	    ch.m4();
	    System.out.println(ch1obj.a);
	    ch1obj.N1();
	}
	

}
