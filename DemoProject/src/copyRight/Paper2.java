package copyRight;

    public class Paper2 {
    	public void n1() {
    		System.out.println("n1 is program");
    	}
    	public static void n2() {
    		System.out.println("n2 is code");
    		Paper2 obj = new Paper2();
    		obj.n1();
    	}
    	public static void main(String[] args) {
    		Paper1 obj = new Paper1();
    		obj.m2();
    		n2();
    	}
        }