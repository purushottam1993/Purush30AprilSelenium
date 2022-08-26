package accessModifCheck2;

import accessModifCheck.ProtectedCheck2;

public class ProtectedCheck3 extends ProtectedCheck2 {
	public void k3()
	{
		System.out.println("assignment");
	}
	public static void main(String[] args) {
		ProtectedCheck3 kk0 = new ProtectedCheck3();
		kk0.k2();
		kk0.k1();
		kk0.k3();
	}
	

}
