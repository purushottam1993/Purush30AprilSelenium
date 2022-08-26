package assignment;

public class CorporateSchool {
	int Maths;
	int Phy;
	int Chem;
	public CorporateSchool(int Maths, int Phy, int Chem, String StudentName) {
		this.Maths=Maths;
		this.Phy=Phy;
		this.Chem=Chem;
		System.out.println("Marks of- "+StudentName);
		System.out.println("maths- "+Maths);
		System.out.println("Phy- "+Phy);
		System.out.println("Chem- "+Chem);
		//TotalMarks(StudentName);
		System.out.println("Total marks of "+StudentName+ "-"+TotalMarks());
		if(Maths>70||Chem>60&&Phy<=60&&TotalMarks()>200) {
			System.out.println("Vishal passed");
		}
		else
		{
			System.out.println("Vishal failed");
		}
	}
	public int TotalMarks() {
		int total = Maths+Phy+Chem;
		return total;
	}
	public static void main(String[] args) {
		new CorporateSchool(55, 60, 65, "Vishal");	
	}		
	}