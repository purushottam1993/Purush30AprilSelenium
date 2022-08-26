package argumentAndreturn;

public class OverViewOfArgReturn {
	public void m1() {
		System.out.println("without arg without return type");
	}
	public int m1(boolean c) {
		int a = 2+3;
		System.out.println("with arg with return type");
		return a;
	}
	public void m1(int a, char u, boolean x) {
		System.out.println("with arg without return type");
	}
	public char m2() {
		System.out.println("without arg with return type");
		return '@';
	}
	public static void main(String[] args) {
		OverViewOfArgReturn obj = new OverViewOfArgReturn();
		obj.m1();
		//int v = obj.m1(false);
		//System.out.println(v);
		System.out.println(obj.m1(false));
	   obj.m1(55, '#', true);
	   //char v = obj.m2();
	   //System.out.println(v);
		System.out.println(obj.m2());
	}
	
	

}
