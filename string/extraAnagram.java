package string;
import java.util.Scanner;
public class extraAnagram {
	

	    static boolean isAnagram(String a, String b) {
	       boolean res=true;
	       boolean[] visited = new boolean[b.length()];
	       if(a.length()==b.length()){
	           for(int i=0;i<a.length();i++){
	               char c=a.charAt(i);
	               res = false;
	               for(int j=0;j<b.length();j++){
	                   if(c==b.charAt(j) && !visited[j]){
	                       visited[j]=true;
	                       res = true;
	                       return res;
	                   }
	               }
	               
	           }
	       }
	       return false;
	        
	    }

	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}

