package pattern;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		Scanner dc= new Scanner(System.in);
	     int num=dc.nextInt();
	     int rvrnum =0;
	     int temp = num;
	     while(temp>0) {
	    	 int lastdigit = temp %10;
	    	 rvrnum = rvrnum*10+lastdigit;
	    	 temp/=10;
	    	 
	     }
	     if(rvrnum==num) {
	    	 System.out.println("this number is palindrome");
	     }
	     else
	    	 System.out.println("this number is not palindrome");

	}

}
