package pattern;

import java.util.Scanner;

public class patternq2 {

	public static void main(String[] args) {
		Scanner nu= new Scanner(System.in);
		int num= nu.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=(num-i);j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=(2*i-1);k++) {
				if(k==1 || k==(2*i-1)) {
				System.out.print(i + " ");
			}
				else
				{
					System.out.print("0" + " ");
				}
			
		}
			System.out.println();
	}

 }
}
