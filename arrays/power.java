package arrays;

import java.util.Scanner;

public class power {
	

	
	    public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        if(t<=500 && t>=0){
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            if(b<=50 && b>=0 ){
	               if(a<=50 && b>=0){
	                if(n<=1 && n>=15){
	                    int x=0;
	                    for(int j=0;j<=n-1;j++){
	                    
	                     x=(int)Math.pow(2,j)*b+x;
	                    }
	                    
	                 System.out.print((a+x) + " ");
	                }
	               }
	            }
	         System.out.println();
	        }
	        in.close();
	    }
	    }
	

}
