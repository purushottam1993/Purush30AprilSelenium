package exam;

public class NonStaicinsideNonStatic {
	public void m1() {
		System.out.println("m1 is NSM");
	}
	public void m2() {
		m1();
		System.out.println("m2 is also NSM");
	}
	public static void main(String[] args) {
	NonStaicinsideNonStatic obj = new NonStaicinsideNonStatic();
	       obj.m2();
	}

}
