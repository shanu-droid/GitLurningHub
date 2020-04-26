package string;
import java.util.StringTokenizer;
import java.util.Scanner;

public class tokeniser {


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        StringTokenizers st=new StringTokenizers(s);
	        String delims="[.,!?'_@]+";
	        int = s.countTokens();
	        System.out.println(st);
	        String[] splitted=s.split(delims);
	        
	        for(int i=0;i<st;i++){
	            System.out.println(splitted[i]);
	        }
	        // Write your code here.
	        scan.close();
	    }
	}

