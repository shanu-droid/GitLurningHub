package Introduction;

import java.text.DecimalFormat;
public class DataTypeTutorials {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		byte x=2;
		int first =3;
		double second = 3.17537831946;
		float rate = 2.3f;
		System.out.println(rate);
		System.out.println(x);
		System.out.println(x+" "+first+" "+df.format(second));
	}

}
