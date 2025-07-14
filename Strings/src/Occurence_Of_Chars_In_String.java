import java.util.Arrays;

public class Occurence_Of_Chars_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Vrishabendra";
String s2=s1.toLowerCase();
//String s3="happy";
String s5="Vrishabendra.J.Hombal";
String s6="Ganesh";


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



//String s4= s3.replace('p', 'z');
//System.out.println(s4);
//System.out.println(s3);

char[] ss=new char[3];
s6.getChars(3, 6, ss, 0);
System.out.println(Arrays.toString(ss));
	
	}

}
