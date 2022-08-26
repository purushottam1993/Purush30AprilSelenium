package constructor;

public class ConCheck1 {
	public ConCheck1(char a, boolean c) {
		System.out.println("1-Velocity");
	}
	public ConCheck1(boolean v, int x) {
		this('$', true);
		System.out.println("2-TrueSpeed is 50");
	}
	public ConCheck1(String City) {
		this(false, 80);
		System.out.println("3-City is Nandura");
	}
	public static void main(String[] args) {
		new ConCheck1("Pune");
	}

}//Assignment 3 is complete i.e print reverse statement of ConCheck constructor.
