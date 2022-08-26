package overloadingOutside;

import overloading.ParentClass;

public class ChildClass2 extends ParentClass { 
	public void m1()
	{
		System.out.println("distance");
	}
	public static void main(String[] args) 
	{		
		ChildClass2 kk = new ChildClass2();
	    kk.m1(0);
	    kk.m1('@');
	  
	  
	}

}
