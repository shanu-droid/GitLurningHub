package pattern;
import java.util.regex.*;
import java.util.Scanner;

public class regex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
			 try{
	             Pattern pat = Pattern.compile(pattern);
	             System.out.println("Valid");
	            }
	          	catch (Exception e){
	                   System.out.println("Invalid");
	              }
	            testCases--;

	}

}
}