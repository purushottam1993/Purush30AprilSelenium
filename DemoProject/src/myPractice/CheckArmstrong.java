package myPractice;
import java.util.Scanner;
public class CheckArmstrong {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Three digit num");
		int num = sc.nextInt();
        int rem,result =0;
		int temp =num;
		while(temp!=0) {
			rem = temp%10; // 1,,
			result = result+rem*rem*rem;// 1+343+27=371
			temp = temp/10;//37..
		}
		if(num==result)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Number is not Armstrong");
		
	}

}
