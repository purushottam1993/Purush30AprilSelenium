package loopWhile;

public class ConCheck2 {
	 public static void main(String[] args)
	 {
		 int i = 0;
		 while (i<=100)
		 {
		   if (i%2==0)
            {
		     i++;
		     continue;
		   }
		   System.out.println(i);
		   i++;
 }
	 }
}
