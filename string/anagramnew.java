package string;

public class anagramnew {

	public static void main(String[] args) {
		String a="Hello";
		String b="hello";
     	boolean isAnagram=true;

		int al[]=new int[256];
		
		for(char c:a.toCharArray()) {
			int index =(int) c;
			al[index]++;
		}
		for(char c:b.toCharArray()) {
			int index =(int) c;
			al[index]--;
		}
		for(int i=0;i<256;i++) {
			if(al[i]!=0) {
			isAnagram=false;
			break;
			}
	
		}
		
		if(isAnagram) {
				
				 System.out.println("these strings are Anagram");
			
				 
			 }
		else
				 System.out.println("these string are not Anagram");
			
			 
		
	        

	}

}
