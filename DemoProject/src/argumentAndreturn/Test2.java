package argumentAndreturn;

public class Test2 {
	public boolean m1(char a) {
		System.out.println(a);//With argument with return type
		int c = 2+3;
		return true;
	}
	public void m1() {
		System.out.println("m1 is non static");
	}
	public static void main(String[] args) {
		Test2 obj = new Test2();
		boolean v=obj.m1('$');
		System.out.println(v);
		obj.m1();
	}
 
}
