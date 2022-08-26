package accessModifCheck;

public class PrivateCheck2 extends PrivateCheck1{
	public void p2()
	{
		System.out.println("private");
	}
	public static void main(String[] args) {
		PrivateCheck2 rr0 = new PrivateCheck2();
		//rr0.p1();  //parent class method is private so we can accessed
		rr0.p2();              //that private method within class only 
	}

}
