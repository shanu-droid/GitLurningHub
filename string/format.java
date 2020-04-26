package string;

import java.util.*; 
import java.text.*; 
public class format {
  public static void main(String[] args) { 
    Scanner sc= new Scanner(System.in);
    double d= sc.nextDouble();
    DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance();
    
    NumberFormat nf1 = NumberFormat.getInstance(Locale.US); 
    dfs.setCurrencySymbol("$");
    System.out.println("Us: " +  " : "+dfs.getCurrencySymbol()+ nf1.format(d)); 
    DecimalFormat IndianCurrencyFormat = new DecimalFormat("##,##,###.00");
    String formattedAmount = IndianCurrencyFormat.format(d);
    dfs.setCurrencySymbol("Rs.");
    System.out.println("India: " +  " : "+ dfs.getCurrencySymbol()+ formattedAmount);
    dfs.setCurrencySymbol("￥");
    NumberFormat nf11 = NumberFormat.getInstance(Locale.CHINA); 
    System.out.println("China: " +  " : "+dfs.getCurrencySymbol()+ nf11.format(d));
    NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE); 
    dfs.setCurrencySymbol("€");
    System.out.println("France: " +  " : "+ nf.format(d)+" "+dfs.getCurrencySymbol()); 
    
    
  }
} 


