package methodCalling;

public class NsvCall {
	int x=10;
	int y=20;
	static int V=11;
	public void m1() {
		int x=55;
		int y=66;
		int V =99; 
		System.out.println(this.x);
		System.out.println(y);
		System.out.println(this.y);
		System.out.println(x);
		System.out.println(V);
		System.out.println(NsvCall.V);
	}
	public static void main(String[] args) {
		NsvCall obj = new NsvCall();
		obj.m1();
		System.out.println(V);
		System.out.println(obj.x);
	}
}

