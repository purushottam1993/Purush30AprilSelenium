package myPractice;

public class CheckPalindrome {
	
	public static void main(String[] args) {
		int value =454; int rem; int rev=0;
		int  num= value;
		while(num>0) {
			rem = num%10; //rem 4,,,5
			rev = rev*10+rem;  //4,,45,,,454
			num = num/10; //
		}
	    if(rev==value)
	    	System.out.println("Number is palindrome");
	    else
	    	System.out.println("Number is not palindrome");
	}

}
