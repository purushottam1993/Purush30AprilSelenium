package methodCalling;

public class Method2 {
	static int v =99;
	int x =101;
	int y =102;
	public void m2() {
		int a =77;
		int b =88;
	}
	public static void main(String[] args) {
		Method1 obj = new Method1();
		obj.m1();
		System.out.println(Method1.c);
		System.out.println(v);
	}
	
}
