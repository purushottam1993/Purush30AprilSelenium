package overloading;

public class MainMethodOverlod {
	public static void main()
	{
		System.out.println("main overloaded");
	}
	public void main(int a)
	{
		System.out.println("Main overloaded");
	}
	public static void main(String[] args)
	{
		main();
		MainMethodOverlod obj = new MainMethodOverlod();	
		obj.main(55);
	}
}
