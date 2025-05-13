
public class First_Non_Repeat_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="swwssss";
		int[] freq= new int[26]; // create frequency array to check occurence of char
		
		
		
		//this loop will traverse across whole string bby takig single char count at 1iteration
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			freq[c-'a']++;
		}
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(freq[c-'a']==1) {
				System.out.println("1st non repeating character is "+ c);
				return;
			}
			
		}
		System.out.println("No non repeating character in string");
	}

}
