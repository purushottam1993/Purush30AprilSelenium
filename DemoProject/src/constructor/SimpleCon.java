package constructor;

public class SimpleCon {
	public SimpleCon() {
		System.out.println("Constructor 1 is running");
	}
	public SimpleCon(int a) {
		System.out.println("Constructor 2 is running");
	}
	public SimpleCon(boolean c) {
		System.out.println("Constructor 3 is running");
	}
	public static void main(String[] args) {
		new SimpleCon(55);//Constructor 2
		new SimpleCon();//Constructor 1
		new SimpleCon(true);//Constructor 3
	}

}
