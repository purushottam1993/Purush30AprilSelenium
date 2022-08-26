package argumentAndreturn;

public class Returnshow {
	public int m1() {
		System.out.println("Integer stored data value");
		int c = 55+1;
		return c;
	}
	public static void main(String[] args) {
		Returnshow obj = new Returnshow();
		obj.m1();
		System.out.println(obj.m1());
		//int v = obj.m1();
		 //System.out.println(v);

	}

}
