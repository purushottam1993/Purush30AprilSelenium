package practiceWork;

public class WhileBreak {
	public static void main(String[] args) {
		int i = 0;
		while(i<=13) {
			if(i==7) 
				break;
			System.out.println("numbers are: "+i);
			i++;
		}
	}
}
