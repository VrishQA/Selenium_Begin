import java.util.Arrays;

public class Max_Occurence_Of_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Vrisshab";
		String s2=s1.toLowerCase();


		int[] freq=new int[26];
		for(int i=0;i<s2.length();i++) {
		char c=s2.charAt(i);
		freq[c-'a']++;
	}
		
		int maxFreq=0;
		char maxChar=' ';
		
		for(int i=0;i<26;i++) {
			if(freq[i] > maxFreq){
				maxFreq=freq[i];
				maxChar=(char) (i+'a');
			}
				
		}
		System.out.println(maxChar +" "+ maxFreq
				);
			
		
	}
		

	
	}
