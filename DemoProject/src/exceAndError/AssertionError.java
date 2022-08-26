package exceAndError;

public class AssertionError {
	public static void main(String[] args) {
		int marks = 59;
		assert marks>=60: "failed";
		System.out.println("Marks : "+marks);
	}
}
