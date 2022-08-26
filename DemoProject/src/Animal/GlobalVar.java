package Animal;

public class GlobalVar {
	static int a=55;
	   int x =10;
	   int y =20;
	   public void m1() {
		   int x =20;
		   int y =10;
		   int a =50;
		   System.out.println(x);
		   System.out.println(this.y);
		   System.out.println(y);
		   System.out.println(this.x);
		   System.out.println(a);
		   System.out.println(GlobalVar.a);
	   }
	   public static void main(String[] args) {
		   GlobalVar obj = new GlobalVar();
		    obj.m1();
		    System.out.println(obj.x);
		    System.out.println(a);
		    System.out.println(obj.y);
		    System.out.println(obj.x);
	}

}
