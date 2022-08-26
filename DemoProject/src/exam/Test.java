package exam;

public class Test {
	 /*int a;
	static int b;
	
 public static void main(String[] args) {
	  Test obj=new Test();
	  System.out.println(obj.a);
	  System.out.println(b);*/
	
	/*static int a=55;
	public static void main(String[] args) {
		int a=44;
		System.out.println(Test.a);*/
	
	int a=88;
	static int b=55;
	public void m1() {
		int a=66;
		int b=45;
		System.out.println(a);
		System.out.println(this.a);
		Test obj=new Test();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(b);
		System.out.println(Test.b);
	}
	public static void main(String[] args) {
		Test obj=new Test();
		obj.m1();
 }
}
