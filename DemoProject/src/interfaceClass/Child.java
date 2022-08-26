package interfaceClass;

public abstract class Child implements Parent{

	@Override
	public void m1() {
		System.out.println("m1 is parent method");
		
	}

	@Override
	public abstract void m2();

}
