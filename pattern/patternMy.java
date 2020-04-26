package pattern;

import java.util.Scanner;

public class patternMy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0;i<=(n/2);i++) {
			for(int j=0;j<=n;j++) {
				if(j>(n/2-i) && j<=(n/2+i)) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
		for(int k=0;k<n/2;k++) {
			for(int m=0;m<=n;m++) {
				if(m <=k || m>(n-k-1) ) {
					System.out.print("* ");
					
				}
				else
					System.out.print("  ");
					
			}
			System.out.println();
			
		}
			
		}
		
		     
					
			
			
			
        
		

  }
 

