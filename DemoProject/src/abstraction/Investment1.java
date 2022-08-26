package abstraction;

abstract class Investment1 {
	public void Login()
	{
		System.out.println("Login method");
	}
	abstract void Password();
	public void Logout()
	{
		System.out.println("logout method");
	}
	
	abstract void UserId();

}
