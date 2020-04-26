package arrays;

public class twoDarray {

	public static void main(String[] args) {
//		int a[][]=new int[5][3];
		int b[][]= {{5,6,7,8},{1,3,4,4},{7,4,42,3},{3,2,2},{2,4,6,4}};
		
		
	    for(int i=0;i<=4;i++) {
	    	for(int j=0;j<=2;j++){
	    		System.out.print(b[i][j] + " ");
	    	}
	    	System.out.println();
	    }
	}

}
