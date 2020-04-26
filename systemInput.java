package systemInput;
import java.util.Scanner;


public class systemInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rate");
		int x = sc.nextInt();
		System.out.println("Enter intrest");
		float y=sc.nextFloat();
		System.out.println("Enter month");
		int z=sc.nextInt();
		double simpleIntrest = (x*y*z)/100;
		System.out.println("Hence simple intrest is " + simpleIntrest);// TODO Auto-generated method stub

	}

}
