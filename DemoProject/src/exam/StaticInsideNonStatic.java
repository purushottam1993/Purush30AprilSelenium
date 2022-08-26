package exam;

public class StaticInsideNonStatic {
	public static void m1() {
		System.out.println("m1 is static method");
	}
	public void m2() {
		System.out.println("m2 is NSM");
		m1();
	}
	public static void main(String[] args) {
		StaticInsideNonStatic obj = new StaticInsideNonStatic();
		obj.m2();
	}

}
