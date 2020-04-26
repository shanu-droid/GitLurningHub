package string;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class currencyFormat {
	public static void main(String[] args) {
	       Scanner sc= new Scanner(System.in);
	    double d= sc.nextDouble();
	    Locale indiaL= new Locale("en","IN");
	    NumberFormat Us = NumberFormat.getCurrencyInstance(Locale.US);
	    NumberFormat India = NumberFormat.getCurrencyInstance(indiaL);
	    NumberFormat China = NumberFormat.getCurrencyInstance(Locale.CHINA);
	    NumberFormat France = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	    NumberFormat italy = NumberFormat.getCurrencyInstance(Locale.ITALY);
	    System.out.println("US: " + Us.format(d));
	    System.out.println("India: " + India.format(d));
	    System.out.println("China: " + China.format(d));
	    System.out.println("France: " + France.format(d));
	    System.out.println("Italy: " + italy.format(d));

	    }

}
