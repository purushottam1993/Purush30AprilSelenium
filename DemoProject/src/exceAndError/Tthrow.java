
package exceAndError;

public class Tthrow {
	public void VotingAge(int Marks) {
		if(Marks<=40)
			throw new IllegalArgumentException("Failed");
		else
		System.out.println("Student is passed and move to next class");
	}
	public static void main(String[] args) {
		Tthrow obj = new Tthrow();
		obj.VotingAge(39);
	}
}
