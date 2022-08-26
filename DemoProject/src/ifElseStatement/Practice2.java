package ifElseStatement;

public class Practice2 {
	public static void main(String[] args) {
		int day = 100;
		int Pocketmoney =3000;
		for(int i=1; i<=day; i++)
		{
			if(day%2==0)
				break;
				//continue;
				Pocketmoney = Pocketmoney-300;
		}
		if(Pocketmoney==0)
			
			System.out.println("total day:"+day);
	}
}
