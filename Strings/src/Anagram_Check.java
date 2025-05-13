import java.util.Arrays;

public class Anagram_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Dormitory";
String s2="Dirty Room";

//System.out.println(s1.length());
//System.out.println(s2.length());

//remove any spaces and convert into uper or lower case
String s4=s1.replaceAll("[^a-zA-Z]","");
String s3=s2.replaceAll("[^a-zA-Z]","");
System.out.println("After removing spaces from origianl string --> "+ s3);


//to sort in order convert it into array
char[]c1=s4.toLowerCase().toCharArray();
char[]c2=s3.toLowerCase().toCharArray();


//from array use sort method
Arrays.sort(c1);
Arrays.sort(c2);

//converting back to strings
String sorted1=new String(c1);
String sorted2=new String(c2);

System.out.println("Applied sorting of alphabets and then verifiying -->"+ sorted1 +"   " + sorted2);

if(sorted1.equals(sorted2)) {
System.out.println("Given 2 Strings are anagrams ");

}else {
	System.out.println("Given 2 Strings are not anagrams");
}

	}

}
