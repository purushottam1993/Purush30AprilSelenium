package assignment;

public class Task1 {
	public int school(int maths, int phy, int chem, String StudentName) {
		int total = maths+phy+chem;
		System.out.println("Marks of student: "+StudentName);
		System.out.println("Maths- "+maths);
		System.out.println("Physics- "+phy);
		System.out.println("Chemistry- "+chem);
		return total;
	}
	public static void main(String[] args) {
		Task1 obj = new Task1();
		//System.out.println(obj.school(87, 92, 85, "Avdhut"));
		int v= obj.school(87, 92, 85, "Avdhut");
		System.out.println("TotalMarks of Avdhut- "+v+'\n');
		int x = obj.school(78, 80, 75, "raju");
		System.out.println("TotalMarks of Raju- "+x+'\n');
		int y = obj.school(88, 79, 85, "Piyush");
		System.out.println("Total Marks of Piyush- "+y+'\n');
}
}
