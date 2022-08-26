package exam;

public class SaraswatiVidyalay1 {
		int maths;
		int phy;
		int chem;
		
	public void exam(int maths,int phy,int chem,String StudentName) {
		this.maths=maths;
		this.phy=phy;
		this.chem=chem;
		System.out.println("Marks of Student- "+StudentName);
		System.out.println("Maths- "+maths);
		System.out.println("Physics- "+phy);
		System.out.println("Chemistry- "+chem);
		TotalMarks();
		System.out.println("\n");
	}
	public int TotalMarks() {
		int total=maths+phy+chem;
		System.out.println("TotalMarks "+"="+total);
		return total;
	}
	    public static void main(String[] args) {
	    SaraswatiVidyalay1 obj = new SaraswatiVidyalay1();
		obj.exam(65, 75, 85, "Avdhut");
		obj.exam(66, 77, 88, "raju");
		obj.exam(77, 88, 95, "Jaggu");
 }
}
