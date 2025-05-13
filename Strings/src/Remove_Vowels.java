
public class Remove_Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Vrishab";
String s2="aeiou";
//char[]s3=s1.toCharArray();

	String x=s1.replaceAll("[aeiouAEIOU]", "");
	System.out.println(x);
	
	
	//other logic
	        String s = "Vrishab";
	        String result = "";

	        for (int i = 0; i < s.length(); i++) {
	            char c = s1.charAt(i);

	            // Check if the character is NOT a vowel
	            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
	                c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
	                result = result + c;  // Append only consonants
	            }
	        }

	        System.out.println("After removing vowels: " + result);  // Output: Vrshb
	    }
	

	
	}



