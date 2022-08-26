package accessModifCheck;

public class CheckFinal2 { //due to 'final' keyword in class1 inheritance not possible
	public void j2()          // and class2 access calss 1's method within package only
	{
		System.out.println("facebook");
	}
	public static void main(String[] args) {
		CheckFinal2 jk = new CheckFinal2();
		jk.j2();
		CheckFinal jkl = new CheckFinal();
		jkl.j1();
	}

}
