package overloading;

public class ChildClass extends  ParentClass  {
	public void m1(boolean a)
	{
		System.out.println("Time");
	}
	public static void main(String[] args)
	{
		/*ParentClass objRef = new ParentClass(); //Case-1
	    objRef.m1('@');
	    objRef.m1(77);*/
		
		/*ChildClass objRef = new ChildClass();  //case-2
		 objRef.m1('@');
		 objRef.m1(false);
		 objRef.m1(77);*/
		 ParentClass ObjRef = new ChildClass();  //Case-3
		ObjRef.m1(55);
		ObjRef.m1(0);
		ObjRef.m1('$');
	//ObjRef.m1();*/ //Nahi chalega Q ki Child ki method Parent ki access pr nahi Call hogi.
		
		//ChildClass ObjRef = new ParentClass();  //Case-4
		//Cyclic ineritance is not possible.....
	}
	
}
