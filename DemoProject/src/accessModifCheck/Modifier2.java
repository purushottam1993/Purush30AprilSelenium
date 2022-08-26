package accessModifCheck;

public class Modifier2 extends Modifier1{
	public int a =10;
	int x =20;
	public void m2() 
	{
		System.out.println("m2 is class 2 method");
		System.out.println(a);
		//System.out.println(super.a);
	}
	public static void main(String[] args) {
		Modifier2 obj = new Modifier2();
		obj.m1();
		obj.m2();
		System.out.println(obj.x);
		//System.out.println(obj.y);
	}

}
