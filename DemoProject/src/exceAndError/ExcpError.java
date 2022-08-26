package exceAndError;

public class ExcpError {
	public void VotingAge(int Age) {
		if(Age>18)
			System.out.println("Eligible for voting");
		else
		throw new ArithmeticException();
	}
public static void main(String[] args) {
	ExcpError obj = new ExcpError();
	obj.VotingAge(17);
}
}
