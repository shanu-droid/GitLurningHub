package pattern;
import java.util.Scanner;
public class waste {

	public static void main(String[] args) {
     Scanner dc= new Scanner(System.in);
     int num=dc.nextInt();
     int numofdigit= (int)Math.log10(num) +1;
     System.out.println(numofdigit);
     

	}

}
