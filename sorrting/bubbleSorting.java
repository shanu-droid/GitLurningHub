package sorrting;

public final class bubbleSorting {

	public static void main(String[] args) {
		
int a[]= {3,4,-1,7,5};
int n=a.length;
for(int i=0;i<n-1;i++) {
	for(int j=0;j<n-1;j++) {
		int min =0;
		if(a[j]>a[j+1]) {
			min=a[j+1];
			a[j+1]=a[j];
			a[j]=min;
		}
	}
		
}
for(int i=0;i<n;i++) {
System.out.print( a[i] + " ");
}
	}

}
