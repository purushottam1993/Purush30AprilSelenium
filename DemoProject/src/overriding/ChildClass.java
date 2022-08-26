package overriding;

public class ChildClass extends ParentClass{
	public void m1()
	{
		System.out.println("Moon is cold");
	}
	public static void main(String[] args) {
		/*ParentClass ObjRef = new ParentClass();
		ObjRef.m1();*/  //Case-1
		/*ParentClass ObjRef = new ChildClass();
		ObjRef.m1();*/  //Case-2
		/*ChildClass ObjRef = new ChildClass();
		ObjRef.m1();*/ //Case-3
		//ChildClass Objref = new ParentClass(); //case-4 This case is not allowed as parent object 
		                                       //cannot be referred by child reference 
		                                        //due to inheritance property 
	}

}
