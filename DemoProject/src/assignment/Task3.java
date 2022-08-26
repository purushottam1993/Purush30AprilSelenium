package assignment;

public class Task3 {
	int maths;
	int phy;
	int chem;
	public Task3(int maths, int phy, int chem, String StudentName) {
		this.maths=maths;
		this.phy=phy;
		this.chem=chem;
		System.out.println("Marks of- "+StudentName);
		System.out.println("Mathematics- "+maths);
		System.out.println("Physics- "+phy);
		System.out.println("chemistry- "+chem);
		//System.out.println("Total Marks- "+TotalMarks()); */ //(OR)
		//System.out.println("Total Marks-"+TotalMarks()+'\n');
		System.out.println("TotalMarks "+TotalMarks());
		System.out.println('\n');
	}
	public int TotalMarks() {
		int total = maths+phy+chem;
		return total;
	}
	public static void main(String[] args) {
		new Task3(88, 70, 72, "Avdhut");
		new Task3(64, 77, 80, "Raju");
		new Task3(59, 64, 74, "Dinesh");
		
	}
	

}
