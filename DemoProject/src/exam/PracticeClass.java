package exam;

public class PracticeClass {
	int maths;
	int phy;
	int chem;
  public void exam(int maths,int phy,int chem,String StudentName) {
		this.maths=maths;
		this.phy=phy;
		this.chem=chem;
		System.out.println("marks of student:"+StudentName);
		System.out.println("Maths:"+maths);
		System.out.println("Physics:"+phy);
		System.out.println("Chemistry:"+chem);
		//int total=math+phy+chem;
		//System.out.println("TotalMarks of "+StudentName+"="+total);
		TotalMarks(StudentName);
	    System.out.println("\n");
	    
  }
  public void TotalMarks(String StudentName) {
	  int total=maths+phy+chem;
	  System.out.println("TotalMarks of "+StudentName+"-"+total);
  }
public static void main(String[] args) {
	PracticeClass obj = new PracticeClass();
	obj.exam(88,89,90,"Avdhut");
	obj.exam(78, 79, 81, "Raju");
	obj.exam(77, 88, 65, "Jaggu");
}
}