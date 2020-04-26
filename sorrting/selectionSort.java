package sorrting;

public class selectionSort {

	
	public static void main(String[] args) {
		int a[]= {6,4,0,-2,7};
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			int minIn=i;
			for(int j=i;j<n;j++) {
				if(a[j]<a[minIn]) {
					int temp=0;
					temp=a[minIn];
					a[minIn]=a[j];
					a[j]=temp;
				}
			}
		}
		
for(int e:a) {
	System.out.print(e+"  ");
}
	}

}
