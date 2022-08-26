package Animal;

public class CheckLeap {
	public static void main(String[] args)
	{
		int year=2004;{
		if((year%100!=0 &&  year%4==0) || (year%400==0))
			System.out.println("year is leap");
		else
				System.out.println("year is not leap year");
	}
	}
}
