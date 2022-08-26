package accessModifCheck2;

import accessModifCheck.Modifier1;
import accessModifCheck.Modifier2;

public class Modifier3 extends Modifier1{
	public void h1()
	{
		System.out.println("h1 chalega");
	}
	public static void main(String[] args) {
		Modifier3 ob = new Modifier3();
		ob.m1();
	    ob.h1();
	    System.out.println(ob.a);
	    Modifier2 obj = new Modifier2();
	    obj.m2();
	    
	    System.out.println(obj.a);
	}

}
