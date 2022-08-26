package class1Toclass2;

public class Constructor2 {
	public Constructor2(int x, char y) {
		this(true, 10);
		System.out.println("i am drinking");
	}
	public Constructor2(char a, boolean b) {
		System.out.println("i am running");
	}
	public Constructor2(boolean c, int d) {
		this('@', false);
		System.out.println("i am i am swimming");
	}
	public static void main(String[] args) {
		new Constructor2(55, '$');
		Constructor1 obj = new Constructor1();
		new Constructor1();
		
	}
	

}
