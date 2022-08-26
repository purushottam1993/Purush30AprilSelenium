package argumentAndreturn;

public class Test4 {
	public int m1() {
		int a = 2+3;
		//System.out.println(a);
		return a;
	}
	public static void main(String[] args) {
		Test4 obj = new Test4();
		obj.m1();
		int v= obj.m1();
		System.out.println(v);
	}
}
