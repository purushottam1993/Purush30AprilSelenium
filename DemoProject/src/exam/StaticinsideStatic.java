package exam;

public class StaticinsideStatic {
	public static void m1() {
		System.out.println("m1 is static method");
	}
		public static void m2() {
			System.out.println("m2 is static method");
			m1();
		}
		public static void main(String[] args) {
			m2();
	}

}
