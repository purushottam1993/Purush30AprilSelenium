package Animal;

public class CheckThiss {
	int a=10;
	public void m1() {
		int a=20;
		System.out.println(this.a);
		System.out.println(a);
	}
	public void m2(int a) {
		System.out.println("m2 is NSM");
	}
	public void m3(boolean c) {
		m2(55);
		System.out.println("m3 is NSM");
	}
	public static void main(String[] args) {
		CheckThiss cc = new CheckThiss();
		cc.m1();
		cc.m3(false);
	}

}
