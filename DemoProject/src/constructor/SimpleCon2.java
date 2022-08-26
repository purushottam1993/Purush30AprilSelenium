package constructor;

public class SimpleCon2 {
	static int x =20;
	int a;
	int b;
	public SimpleCon2() {
		int x =25;
		int a=10;
		this.a=10;
		int b=20;
		this.b=20;
		System.out.println(a);
		System.out.println(this.b);
		System.out.println(this.a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(SimpleCon2.x);
	}
	public static void main(String[] args) {
		new SimpleCon2();
	}

}
