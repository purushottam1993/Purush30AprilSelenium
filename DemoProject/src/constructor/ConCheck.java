package constructor;

public class ConCheck {
	public ConCheck(int a, boolean c) {
		this(true, 99);
		System.out.println("Constructor 1 is running");
	}
	public ConCheck(boolean a, int c) {
		this();
		System.out.println("Constructor 2 is running");
	}
	public ConCheck() {
		System.out.println("Constructor 3 is running");
	}
	public static void main(String[] args) {
		new ConCheck(55, false);
		//new ConCheck(true, 99);
		//new ConCheck();
	}

}
