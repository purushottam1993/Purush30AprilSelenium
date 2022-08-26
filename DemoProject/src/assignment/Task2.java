package assignment;

public class Task2 {
	int maths;
	int phy;
	int chem;
	public void college(int maths, int phy, int chem, String StudentName) {
		this.maths = maths;
		this.phy = phy;
		this.chem = chem;
		System.out.println("Marks of "+StudentName);
		System.out.println("Maths- "+maths);
		System.out.println("Phy- "+phy);
		System.out.println("Chem- "+chem);
		TotalMarks(StudentName);
		System.out.println();
	}
	public void TotalMarks(String StudentName) {
		int total = maths+phy+chem; 
		System.out.println("Total marks of "+StudentName+"-"+total);
	}
	public static void main(String[] args) {
		Task2 obj = new Task2();
		obj.college(64,48,47,"Joy");
		obj.college(75, 78, 85, "Amar");
		obj.college(66, 77, 88, "Sameer");
	}

}
