package methods;

public class methodsIntro {

	public static void main(String[] args) {
		int fi=34;
		int se=23;
		int result = maxOf(fi,se);
		System.out.println(result);
		saySomething();
		saySomething();

	}
	static int maxOf(int a, int b) {
		if(a>b) {
			return a;
		}
		else
			return b;
	}
	static void saySomething() {
		System.out.println("Hi");
		System.out.println("Good Moring jiiiiiiiiii");
	}

}
