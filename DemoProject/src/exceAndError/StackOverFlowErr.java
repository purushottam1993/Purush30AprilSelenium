package exceAndError;

public class StackOverFlowErr {
	public void m1() {
	System.out.println("m1 is parent method");
		m2();
	}
	public void m2() {
	System.out.println("m2 is another parent method");
		m1();
	}
	public static void main(String[] args) {
	StackOverFlowErr obj = new StackOverFlowErr();
		obj.m1();
	}

}
