
public class Occurence_Of_Chars_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Vrishabendra";
String s2=s1.toLowerCase();


int[] freq=new int[26];
for(int i=0;i<s2.length();i++) {
char c=s2.charAt(i);
freq[c-'a']++;

}

for(int i=0;i<26;i++) {
	if(freq[i]>0) {
	char c1	=(char)(i+'a');
	System.out.println(c1 + " → " + freq[i]);
	}
}


	
	}

}
