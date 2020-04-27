package string;
import java.util.StringTokenizer;
import java.util.Scanner;

public class tokeniser {


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
       
            if(s.isEmpty()){
            System.out.println("0");
            return;
            }
            else if(s.length()>400000){
            return;
            }
            else{
            s=s.trim();
            String delims="[- !,?._'@]+";
            StringTokenizer st=new StringTokenizer(s,delims);
            String[] splitted=s.split(delims);
            int  n= splitted.length;
            System.out.println(n);
            for(int i=0;i<n;i++){
            System.out.println(splitted[i]);
             }
             }

	    }
	}

