package abstraction;

abstract class Investment2 extends Investment1{

	@Override
	void Password() 
	{
		System.out.println("Pass@123");
		
	}

	@Override
	abstract void UserId();

}
