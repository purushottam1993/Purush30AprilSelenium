package exam;

public class NonStaticInsideStatic {
	public void m1() {
		System.out.println("m1 is not running");
	}
	public static void m2() {
		NonStaticInsideStatic obj = new NonStaticInsideStatic();
		obj.m1();
		System.out.println("m2 is running");
	}
	public static void main(String[] args) {
		m2();
	}

}
