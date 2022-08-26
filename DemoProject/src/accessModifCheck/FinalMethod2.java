package accessModifCheck;

public class FinalMethod2 extends FinalMethod1{ //inheritance not possible
	public void m2()  //overridden not possible within package or outside package
	{
		System.out.println("Acceleration");
	}
	public static void main(String[] args) {
		FinalMethod2 abc = new FinalMethod2();
		abc.m2();
		abc.m1();
		//FinalMethod1 bb = new FinalMethod1();
		//bb.m1();
	}

}
