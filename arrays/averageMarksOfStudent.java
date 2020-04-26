package arrays;

import java.util.Scanner;

public class averageMarksOfStudent {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n = sc.nextInt();
		int marks[]= new int[n];
		System.out.println("Enter the marks of each student");
		for(int i=0;i<n;i++) {
			marks[i] = sc.nextInt();
			
			sum += marks[i];
		}
		
        int average=sum/n;
        System.out.println("the average marks of class is " + average);
	}

}
