package class1Toclass2;

public final class Constructor1 {
	public Constructor1() {
		this(64, true);
		System.out.println("i am learning");
	}
	public Constructor1(int a, boolean c) {
		this(false, '$');
		System.out.println("i am playing");
	}
	public Constructor1(boolean c, char x) {
		this(55,'@');
		System.out.println("i am eating");
	}
	public Constructor1(int i, char j) {
		System.out.println("i am sleeping");
	}
	public static void main(String[] args) {
		new Constructor1();
	}
}
