package arrays;

import java.util.Scanner;

public class rotationOfArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        int x= scan.nextInt();
        int y= scan.nextInt();
        int temp;
        int a[]= new int[x];
        for(int i=0;i<x;i++){
         a[i]=scan.nextInt();
        }
        for(int j=0;j<=y;j++){
            temp= a[x-1];
            for(int k=x-1;k>0;k--){
                a[k]=a[k-1];
            }
            a[0]=temp;
        }
        for(int m=0;m<x;m++){
         System.out.print(a[m]);
        }
        

	}

}
