package pattern;
import java.util.regex.*;
import java.util.Scanner;
public class javaregex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String pattern = in.nextLine();
		String ZeroTo255 = "\\d{1,2}|(0|1)\\d{2}|20[0-4]\\d|25[0-5]";
		String fil= ZeroTo255 +"\\."+ZeroTo255 +"\\."+ZeroTo255 +"\\."+ ZeroTo255 ;
		Pattern p = Pattern.compile(fil);
		
		Matcher m=p.matcher(pattern);
		Boolean bl = m.matches();
		System.out.println(bl);
	}

}
