package arrays;

import java.util.Scanner;

public class AdditionOfMatrix {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter row and column:");
		int rows=sc.nextInt();
		int columns = sc.nextInt();
		int a[][]= new int[rows][columns];
		int b[][]= new int[rows][columns];
		int c[][]= new int[rows][columns];
		
		System.out.println("matrix A:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("matrix B:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Addition of both matrix:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				c[i][j] = a[i][j]+b[i][j];
				System.out.print(c[i][j] + " ");
				
			}
			System.out.println();
		}
	    
	}
}
