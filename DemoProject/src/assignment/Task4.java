package assignment;

public class Task4 {
	/*public Task4(int maths, int phy, int chem, String StudentName) {
		int total = maths+phy+chem;
		System.out.println("Marks of- "+StudentName);
		System.out.println("maths- "+maths);
		System.out.println("Phy- "+phy);
		System.out.println("Chem- "+chem);
		System.out.println("Total Marks of "+StudentName+"-"+total+'\n');
	}
	public static void main(String[] args) {
		new Task4(70, 80, 90, "Amol");
		new Task4(55, 66, 77, "RAju");*/
	
	int Maths;
	int Phy;
	int Chem;
	public Task4(int Maths, int Phy, int Chem, String StudentName) {
		this.Maths=Maths;
		this.Phy=Phy;
		this.Chem=Chem;
		System.out.println("Marks of- "+StudentName);
		System.out.println("maths- "+Maths);
		System.out.println("Phy- "+Phy);
		System.out.println("Chem- "+Chem);
		TotalMarks(StudentName);
	}
	public void TotalMarks(String StudentName) {
		int total = Maths+Phy+Chem;
		System.out.println("Total Marks of "+StudentName+"-"+total);
		if(Maths>70||Chem>60&&Phy<=60&&total>200) {
			System.out.println("Vishal passed");
		}
		else
		{
			System.out.println("Vishal failed");
		}
	}
	public static void main(String[] args) {
		new Task4(55, 60, 65, "Vishal");
	}
	}

