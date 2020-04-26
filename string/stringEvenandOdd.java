package string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class stringEvenandOdd {
    public static void main(String[] args) {
       Scanner sc= new Scanner (System.in);
       int n= sc.nextInt();
       sc.nextLine();
       for(int i=0;i<n;i++){
           String str=sc.nextLine();
           String even="";
           String odd="";
           
             for(int j=0;j<str.length();j++){
               if(j==0 || j%2==0 ){
                   even+=str.charAt(j);
               }
               else{
                  odd+=str.charAt(j);
               }
           }
         System.out.println(even +" "+odd);
       }
    }
}



