package string;

public class anagram {

	public static void main(String[] args) {
		String a="anagramm" ; 
				
		String b="marganaa";
     	boolean isAnagram=true;
		boolean visted[] = new boolean[b.length()];
	   if(a.length()==b.length()) {
		   for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			isAnagram=false;
			   for(int j=0;j<b.length();j++) {
				 if(c == b.charAt(j) && !visted[j]) {
					 visted[j]=true;
					  isAnagram=true;
					  break;
				  }
			 }
		   
		   
		     if(!isAnagram) {
					 break;
			   } 
		   }
	   }
//		int al[]=new int[256];
//		int bl[]=new int[256];
//		for(char c:a.toCharArray()) {
//			int index =(int) c;
//			al[index]++;
//		}
//		for(char c:b.toCharArray()) {
//			int index =(int) c;
//			bl[index]++;
//		}
//		for(int i=0;i<256;i++) {
//			if(al[i]!=bl[i]) {
//			isAnagram=false;
//			break;
//			}
//	
//		}
//		
		if(isAnagram) {
				
				 System.out.println("these strings are Anagram");
			
				 
			 }
		else
				 System.out.println("these string are not Anagram");
			
			 
		
	        

	}
	
}
