package methodCalling;

public class Variables {
	static int A =25;
	int X = 50;
	static int B =22;
	int Y =55;
	public void m1() {
		int A =11;
		int B =33;
		int X =15;
		int Y =30;
		System.out.println(A);
		System.out.println(B);
		System.out.println(Y);
		System.out.println(X);
		System.out.println(this.X);
		System.out.println(this.Y);
		System.out.println(Variables.A);
		System.out.println(Variables.B);
	}
	public static void main(String[] args) {
		Variables obj = new Variables();
		obj.m1();
		System.out.println(A);
		System.out.println(obj.Y);
	}
}
