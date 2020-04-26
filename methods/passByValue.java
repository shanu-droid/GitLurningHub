package methods;

public class passByValue {

	public static void main(String[] args) {
//		int c=34;
//		int d=24;
//		swap(c,d);
//		
//		System.out.println(c +" "+d);
		Dog c= new Dog();
		c.legs=4;
		Dog d= new Dog();
		d.legs=8;
		swap(c,d);
		System.out.println(c.legs+" "+d.legs);
		changeDog(c,d);
		System.out.println(c.legs+" "+d.legs);
		
		
		}
		
	

	
	static void swap(int a, int b) {
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
	}
	static void changeDog(Dog f,Dog j) {
		int temp;
		temp=f.legs;
		f.legs=j.legs;
		j.legs=temp;
	}
	static void swap(Dog a, Dog b) {
		Dog temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a.legs);
		System.out.println(b.legs);
	}
}
	  class Dog {
		int legs;
	
}


