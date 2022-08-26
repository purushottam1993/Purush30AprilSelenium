package Animal;

public class LocalVar {
	 public void m1() {
		int a =10;
		int b= 20;
		a= a+10;
		{
		System.out.println(b);
		System.out.println(a);
	    }
	 }
	public static void main(String[] args) {
		LocalVar obj = new LocalVar();
		obj.m1();
	}

}
